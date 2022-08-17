//задача про команды
import java.util.*;

public class Task_2 {

    Task_2() {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String[] teams = new String[N];
        scan.nextLine();
        for(int i = 0; i < N; i++) {
            teams[i] = (scan.nextLine().toUpperCase(Locale.ROOT));
        }

        for(int i = 0; i < N; i++) {
            teams[i] = teams[i].replaceAll("\\s+","");
        }

        for(int i = 0; i < N; i++) {
            char[] chars = teams[i].toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            teams[i] = sorted;
        }

        Map<String, Integer> mp = new HashMap<>();
        for(String team: teams) {
            if(!mp.containsKey(team)) {
                mp.put(team, 1);
            }
            else {
                mp.put(team, mp.get(team) + 1);
            }
        }
        System.out.println(Collections.max(mp.values()));
    }

    public static void main(String[] args) {
        Task_2 t2 = new Task_2();
    }
}

//задача про систему поиска карточек по префиксу фамилии
import java.util.*;

public class Task_5 {

    Task_5() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q = scan.nextInt();

        String[] names = new String[n];
        for(int i = 0; i < n; i++) {
            names[i] = scan.next();
        }

        Integer[] k = new Integer[q];
        String[] s = new String[q];
        for(int i = 0; i < q; i++) {
            k[i] = scan.nextInt();
            s[i] = scan.next();
        }

        for(int i = 0; i < k.length; i++) {
            List<String> subQueries = new ArrayList<>();
            for(String name: names) {
                if (s[i].length() <= name.length() && Objects.equals(s[i], name.substring(0, s[i].length()))) {
                    subQueries.add(name);
                }
            }
            if(subQueries.size() >= k[i]) {
                String nameK = subQueries.get(k[i] - 1);
                System.out.println(Arrays.asList(names).indexOf(nameK) + 1);
            }
            else {
                System.out.println("-1");
            }
        }
    }

    public static void main(String[] args) {
        Task_5 t5 = new Task_5();
    }
}

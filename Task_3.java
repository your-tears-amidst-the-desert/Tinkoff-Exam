import java.util.*;

public class Task_3 {

    Task_3() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Integer[] data = new Integer[n];
        for (int i = 0; i < n; i++) {
            data[i] = scan.nextInt();
        }

        List<Integer> sub = new ArrayList<>();
        List<Integer> unsub = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                unsub.add(data[i]);
            } else {
                sub.add(data[i]);
            }
        }

        int maxUnsub = Collections.max(unsub);
        int indexUn = unsub.indexOf(maxUnsub);

        int minSub = Collections.min(sub);
        int indexSub = sub.indexOf(minSub);

        unsub.set(indexUn, minSub);
        sub.set(indexSub, maxUnsub);

        int sumUn = 0;
        for (int i = 0; i < unsub.size(); i++) {
            sumUn += unsub.get(i);
        }
        int sumSub = 0;
        for (int i = 0; i < sub.size(); i++) {
            sumSub += sub.get(i);
        }

        int result;
        result = sumSub - sumUn;

        System.out.println(result);
    }

    public static void main(String[] args) {
        Task_3 t3 = new Task_3();
    }
}

//задача про стартап по продаже доменов
import java.util.Locale;
import java.util.Scanner;

public class Task_8 {

    Task_8() {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        scan.nextLine();
        String[] domens = new String[n];
        for(int i = 0; i < n; i++) {
            domens[i] = scan.nextLine().toUpperCase(Locale.ROOT);
        }

        String[] start = new String[m];
        String[] finish = new String[m];
        for(int i = 0; i < m; i++) {
            start[i] = scan.next();
            finish[i] = scan.next();
        }

        for(int i = 0; i < m; i++) {
            int count = 0;
            for (String dom : domens) {
                if (dom.startsWith(start[i].toUpperCase()) & dom.endsWith(finish[i].toUpperCase(Locale.ROOT))) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        Task_8 t8 = new Task_8();
    }
}

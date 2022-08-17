//задача про отделы
import java.util.Scanner;

public class Task_1 {

    Task_1() {
        Scanner scan = new Scanner(System.in);
        int x1 = scan.nextInt();
        int y1 = scan.nextInt();
        int x2 = scan.nextInt();
        int y2 = scan.nextInt();

        int X1 = scan.nextInt();
        int Y1 = scan.nextInt();
        int X2 = scan.nextInt();
        int Y2 = scan.nextInt();

        int xMin = Math.min(x1, X1);
        int xMax = Math.max(x2, X2);
        int yMin = Math.min(y1, Y1);
        int yMax = Math.max(y2, Y2);
        int gainX = xMax - xMin;
        int gainY = yMax - yMin;

        if(gainX > gainY) {
            System.out.println(gainX * gainX);
        }
        else {
            System.out.println(gainY * gainY);
        }
    }

    public static void main(String[] args) {
        Task_1 t1 = new Task_1();
    }
}

import java.util.*;
import java.util.regex.Pattern;

public class Task_4 {

    Task_4() {
        Scanner scan = new Scanner(System.in);
        List<String> operations = new ArrayList<>();

        String rgx1 = "[a-z]{1,10}[=]{1}[a-z]{1,10}";
        String rgx2 = "[a-z]{1,10}[=]{1}[0-9]{1,10}";
        String rgx3 = "[{]{1}";
        String rgx4 = "[}]{1}";
        String rgxEr = "[a-z]{1,10}[=][-]{1}[0-9]{1,10}";

        Pattern pt1 = Pattern.compile(rgx1);
        Pattern pt2 = Pattern.compile(rgx2);
        Pattern pt3 = Pattern.compile(rgx3);
        Pattern pt4 = Pattern.compile(rgx4);
        Pattern ptEr = Pattern.compile(rgxEr);

        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> mapOld1 = new HashMap<>();
        Map<String, Integer> mapOld2 = new HashMap<>();

        int k = 0;
        while ( (scan.hasNext(pt1) | scan.hasNext(pt2) | scan.hasNext(pt3) | scan.hasNext(pt4) | scan.hasNext(ptEr))) {
            operations.add(scan.next());
            if(k == 14) {
                break;
            }
            k++;
        }


        int kef = 0;
        for(int i = 0; i < operations.size(); i++) {
            if(operations.get(i).matches(rgx1)) {
                String[] parts = operations.get(i).split("=");
                if(map.get(parts[1]) != null) {
                    map.put(parts[0], map.get(parts[1]));
                    System.out.println(map.get(parts[1]));
                }
                else {
                    System.out.println("0");
                }
            }
            else if(operations.get(i).matches(rgx2)) {
                String[] parts = operations.get(i).split("=");
                map.put(parts[0], Integer.valueOf(parts[1]));
            }
            else if(operations.get(i).matches(rgx3)) {
                if(mapOld1.isEmpty()) {
                    mapOld1.putAll(map);
                    kef = 1;
                }
                else {
                    mapOld2.putAll(map);
                    kef = 2;
                }
            }
            else if(operations.get(i).matches(rgx4)) {
                map.clear();
                if(kef == 1) {
                    map.putAll(mapOld1);
                    kef--;
                }
                else {
                    map.putAll(mapOld2);
                    kef--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Task_4 t4 = new Task_4();
    }
}

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeData {
    public static void main(String[] args) {
        int[] ages = {25, 30, 40, 20};
        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) list.add(age);

        int youngest = Collections.min(list);
        int oldest = Collections.max(list);

        System.out.println("Youngest: " + youngest);
        System.out.println("Oldest: " + oldest);
    }
}

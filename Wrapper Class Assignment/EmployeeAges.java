import java.util.ArrayList;
import java.util.Collections;

public class EmployeeAges {
  public static void main(String[] args) {
    int[] ages = {28, 35, 22, 41, 30};
    ArrayList<Integer> list = new ArrayList<>();
    for (int a : ages) list.add(a);
    int youngest = Collections.min(list);
    int oldest = Collections.max(list);
    System.out.println("Ages list: " + list);
    System.out.println("Youngest: " + youngest);
    System.out.println("Oldest: " + oldest);
  }
}

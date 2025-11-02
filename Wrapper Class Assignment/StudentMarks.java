import java.util.ArrayList;
import java.util.List;

public class StudentMarks {
  private static Integer toInteger(Object o) {
    try {
      if (o == null) return null;
      if (o instanceof Integer) return (Integer) o;
      if (o instanceof String) {
        String s = ((String) o).trim();
        if (s.equalsIgnoreCase("null") || s.isEmpty()) return null;
        return Integer.valueOf(Integer.parseInt(s));
      }
      if (o instanceof Number) return ((Number) o).intValue();
    } catch (NumberFormatException e) {
      return null;
    }
    return null;
  }

  public static void main(String[] args) {
    Object[] mixed = {"85", 95, Integer.valueOf(88), "null", "abc", 76.0};
    List<Integer> valid = new ArrayList<>();
    for (Object x : mixed) {
      Integer v = toInteger(x);
      if (v != null) valid.add(v);
    }
    int sum = 0;
    for (Integer v : valid) sum += v;
    double avg = valid.isEmpty() ? 0.0 : (sum * 1.0) / valid.size();

    System.out.println("Valid marks: " + valid);
    System.out.println("Average: " + avg);
  }
}

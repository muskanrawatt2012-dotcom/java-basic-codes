import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RatingsAnalyzer {
  public static void main(String[] args) {
    int[] oldSystem = {5, 4, 3, 5};
    ArrayList<Integer> newSystem = new ArrayList<>(Arrays.asList(5, null, 4, 3));

    List<Integer> merged = new ArrayList<>();
    for (int r : oldSystem) merged.add(r);
    for (Integer r : newSystem) merged.add(r);

    merged.removeIf(Objects::isNull);

    int sum = 0;
    for (Integer r : merged) sum += r;
    double avg = merged.isEmpty() ? 0.0 : (sum * 1.0) / merged.size();

    System.out.println("Merged ratings: " + merged);
    System.out.println("Average rating: " + avg);
  }
}

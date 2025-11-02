import java.util.ArrayList;
import java.util.List;

public class SensorLogger {
  private final List<Double> store = new ArrayList<>();

  public void log(double temp) {
    store.add(temp);
  }

  public void log(Double temp) {
    if (temp != null) store.add(temp);
  }

  public double average() {
    if (store.isEmpty()) return 0.0;
    double sum = 0.0;
    for (Double v : store) sum += v;
    return sum / store.size();
  }

  public static void main(String[] args) {
    SensorLogger logger = new SensorLogger();
    logger.log(25.5);
    logger.log(Double.valueOf(26.0));
    logger.log((Double) null);
    System.out.println("Average temp: " + logger.average());
  }
}

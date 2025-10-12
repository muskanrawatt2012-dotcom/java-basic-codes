import java.util.function.Predicate;

public class TemperatureAlert {
    public static void main(String[] args) {
        Predicate<Double> alert = temp -> temp > 35.0;
        double temp = 37.5;
        if (alert.test(temp))
            System.out.println("ALERT! Temperature too high!");
        else
            System.out.println("Temperature Normal");
    }
}

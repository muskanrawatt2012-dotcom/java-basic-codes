import java.util.ArrayList;
import java.util.Collections;

public class DoubleCollection {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();
        double sum = 0.0;

        for (double price : prices) {
            list.add(price);
            sum += price;
        }

        double max = Collections.max(list);
        double avg = sum / list.size();

        System.out.println("Highest price: " + max);
        System.out.println("Average price: " + avg);
    }
}

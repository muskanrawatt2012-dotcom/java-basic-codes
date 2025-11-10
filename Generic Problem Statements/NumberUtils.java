import java.util.List;

public class NumberUtils {
    public static double sumNumbers(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2, 3, 4);
        System.out.println("Sum of Integers: " + sumNumbers(intList));

        List<Double> dblList = List.of(2.5, 3.5, 4.5);
        System.out.println("Sum of Doubles: " + sumNumbers(dblList));
    }
}

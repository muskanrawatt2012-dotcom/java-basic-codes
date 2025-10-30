import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {
        List<String> prices = List.of("250", "499", "99", "abc");
        int total = 0;

        for (String price : prices) {
            try {
                total += Integer.parseInt(price);
            } catch (NumberFormatException e) {
                System.out.println("Invalid price: " + price);
            }
        }

        System.out.println("Total price: " + total);
    }
}

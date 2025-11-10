import java.util.List;

public class PriceCalculator {
    public static <T extends Product> double calculateTotal(List<T> items) {
        double total = 0;
        for (T item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public static void main(String[] args) {
        List<Product> mobiles = List.of(new Product(500), new Product(700));
        List<Product> laptops = List.of(new Product(1000), new Product(1500));

        System.out.println("Total Mobile Price: " + calculateTotal(mobiles));
        System.out.println("Total Laptop Price: " + calculateTotal(laptops));
    }
}

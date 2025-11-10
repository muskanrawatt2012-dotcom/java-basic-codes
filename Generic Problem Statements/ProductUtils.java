public class ProductUtils {
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        double discountedPrice = product.getPrice() * (1 - percentage / 100);
        System.out.println("Discounted price: " + discountedPrice);
    }
}

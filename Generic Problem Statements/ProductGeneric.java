public class Product<T extends ProductCategory> {
    private double price;
    private T category;

    public Product(double price, T category) {
        this.price = price;
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public T getCategory() {
        return category;
    }
}

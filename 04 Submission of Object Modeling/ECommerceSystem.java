import java.util.*;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) { this.name = name; this.price = price; }
    public double getPrice() { return price; }
    public String getName() { return name; }
}

class Order {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product p) { products.add(p); }

    public void showOrder() {
        double total = 0;
        System.out.println("Order details:");
        for (Product p : products) {
            System.out.println(p.getName() + " - $" + p.getPrice());
            total += p.getPrice();
        }
        System.out.println("Total: $" + total);
    }
}

class Customer {
    private String name;

    public Customer(String name) { this.name = name; }
    public void placeOrder(Order o) {
        System.out.println(name + " placed an order:");
        o.showOrder();
    }
}

public class ECommerceSystem {
    public static void main(String[] args) {
        Customer c1 = new Customer("Alice");
        Order o1 = new Order();

        o1.addProduct(new Product("Laptop", 800));
        o1.addProduct(new Product("Phone", 500));

        c1.placeOrder(o1);
    }
}

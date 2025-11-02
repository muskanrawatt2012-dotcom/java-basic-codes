package lambda_expressions;

import java.util.*;

class Product {
    String name;
    double price;
    double rating;
    double discount;

    Product(String name, double price, double rating, double discount) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.discount = discount;
    }

    @Override
    public String toString() {
        return name + " | Price: " + price + " | Rating: " + rating + " | Discount: " + discount + "%";
    }
}

public class ProductSort {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Shoes", 3000, 4.5, 10));
        products.add(new Product("Watch", 5000, 4.8, 20));
        products.add(new Product("Bag", 2000, 4.2, 15));

        System.out.println("Sort by Price:");
        products.sort((p1, p2) -> Double.compare(p1.price, p2.price));
        products.forEach(System.out::println);

        System.out.println("\nSort by Rating:");
        products.sort((p1, p2) -> Double.compare(p2.rating, p1.rating));
        products.forEach(System.out::println);

        System.out.println("\nSort by Discount:");
        products.sort((p1, p2) -> Double.compare(p2.discount, p1.discount));
        products.forEach(System.out::println);
    }
}

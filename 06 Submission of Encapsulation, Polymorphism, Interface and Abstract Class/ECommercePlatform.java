interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() { return price; }
    public abstract double calculateDiscount();
}

// Subclasses
class Electronics extends Product implements Taxable {
    public Electronics(int id, String name, double price) { super(id, name, price); }

    @Override public double calculateDiscount() { return getPrice() * 0.1; } // 10% off
    @Override public double calculateTax() { return getPrice() * 0.18; } // 18% GST
    @Override public String getTaxDetails() { return "18% GST"; }
}

class Clothing extends Product implements Taxable {
    public Clothing(int id, String name, double price) { super(id, name, price); }

    @Override public double calculateDiscount() { return getPrice() * 0.2; } // 20% off
    @Override public double calculateTax() { return getPrice() * 0.05; } // 5% tax
    @Override public String getTaxDetails() { return "5% VAT"; }
}

class Groceries extends Product {
    public Groceries(int id, String name, double price) { super(id, name, price); }

    @Override public double calculateDiscount() { return getPrice() * 0.05; } // 5% off
}

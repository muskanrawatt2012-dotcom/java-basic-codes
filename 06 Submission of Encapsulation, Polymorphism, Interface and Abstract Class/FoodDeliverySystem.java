interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }
    public void getItemDetails() { System.out.println(itemName + " - $" + price + " x " + quantity); }

    public abstract double calculateTotalPrice();
}

// Subclasses
class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override public double calculateTotalPrice() { return getPrice() * getQuantity(); }
    @Override public double applyDiscount() { return calculateTotalPrice() * 0.1; }
    @Override public String getDiscountDetails() { return "10% veg discount"; }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) { super(name, price, qty); }

    @Override public double calculateTotalPrice() { return getPrice() * getQuantity() + 20; } // extra charge
    @Override public double applyDiscount() { return calculateTotalPrice() * 0.05; }
    @Override public String getDiscountDetails() { return "5% non-veg discount"; }
}

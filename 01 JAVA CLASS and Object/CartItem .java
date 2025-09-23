class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int q) {
        quantity += q;
        System.out.println(q + " " + itemName + "(s) added to cart.");
    }

    void removeItem(int q) {
        if (q <= quantity) {
            quantity -= q;
            System.out.println(q + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough items in cart!");
        }
    }

    void displayTotal() {
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem("Shoes", 1500, 2);
        c.addItem(1);
        c.removeItem(1);
        c.displayTotal();
    }
}

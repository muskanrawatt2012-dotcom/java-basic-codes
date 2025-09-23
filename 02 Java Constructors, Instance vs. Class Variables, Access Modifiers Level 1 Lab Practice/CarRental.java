class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    double dailyRate = 1000;

    CarRental() {
        customerName = "Unknown";
        carModel = "Not Assigned";
        rentalDays = 0;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * dailyRate;
    }

    void displayRental() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.println("Total Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental r1 = new CarRental();
        CarRental r2 = new CarRental("Amit", "Toyota Innova", 5);

        r1.displayRental();
        System.out.println();
        r2.displayRental();
    }
}

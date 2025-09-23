interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public double getRentalRate() { return rentalRate; }
    public abstract double calculateRentalCost(int days);
}

// Subclasses
class Car extends Vehicle implements Insurable {
    public Car(String num, double rate) { super(num, "Car", rate); }

    @Override public double calculateRentalCost(int days) { return days * getRentalRate(); }
    @Override public double calculateInsurance() { return 500; }
    @Override public String getInsuranceDetails() { return "Car insurance: $500"; }
}

class Bike extends Vehicle implements Insurable {
    public Bike(String num, double rate) { super(num, "Bike", rate); }

    @Override public double calculateRentalCost(int days) { return days * getRentalRate(); }
    @Override public double calculateInsurance() { return 200; }
    @Override public String getInsuranceDetails() { return "Bike insurance: $200"; }
}

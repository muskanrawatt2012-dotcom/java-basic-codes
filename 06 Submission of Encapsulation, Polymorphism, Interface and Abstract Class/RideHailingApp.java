interface GPS {
    String getCurrentLocation();
    void updateLocation(String location);
}

abstract class RideVehicle {
    private int vehicleId;
    private String driverName;
    private double ratePerKm;

    public RideVehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public double getRatePerKm() { return ratePerKm; }
    public void getVehicleDetails() { System.out.println("Driver: " + driverName + ", Rate: " + ratePerKm); }

    public abstract double calculateFare(double distance);
}

// Subclasses
class RideCar extends RideVehicle implements GPS {
    public RideCar(int id, String driver, double rate) { super(id, driver, rate); }

    @Override public double calculateFare(double distance) { return distance * getRatePerKm(); }
    @Override public String getCurrentLocation() { return "Current location fetched"; }
    @Override public void updateLocation(String location) { System.out.println("Updated location to " + location); }
}

class RideBike extends RideVehicle implements GPS {
    public RideBike(int id, String driver, double rate) { super(id, driver, rate); }

    @Override public double calculateFare(double distance) { return distance * getRatePerKm() * 0.8; } // cheaper
    @Override public String getCurrentLocation() { return "Bike location"; }
    @Override public void updateLocation(String location) { System.out.println("Updated location to " + location); }
}

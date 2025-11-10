import java.util.ArrayList;
import java.util.List;

public class FleetManager<T extends Vehicle> {
    private List<T> fleet = new ArrayList<>();

    public void addVehicle(T vehicle) {
        fleet.add(vehicle);
    }

    public void showFleet() {
        for (T vehicle : fleet) {
            System.out.println(vehicle.getName());
        }
    }

    public static void main(String[] args) {
        FleetManager<Truck> truckFleet = new FleetManager<>();
        truckFleet.addVehicle(new Truck("Volvo"));
        truckFleet.addVehicle(new Truck("Scania"));

        FleetManager<Bike> bikeFleet = new FleetManager<>();
        bikeFleet.addVehicle(new Bike("Honda"));
        bikeFleet.addVehicle(new Bike("Yamaha"));

        truckFleet.showFleet();
        bikeFleet.showFleet();
    }
}

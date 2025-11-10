public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Truck extends Vehicle {
    public Truck(String name) {
        super(name);
    }
}

class Bike extends Vehicle {
    public Bike(String name) {
        super(name);
    }
}

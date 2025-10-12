interface Vehicle {
    void displaySpeed();
    default void displayBattery() {
        System.out.println("Battery information not available.");
    }
}

class ElectricCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 80 km/h"); }
    public void displayBattery() { System.out.println("Battery: 75%"); }
}

class PetrolCar implements Vehicle {
    public void displaySpeed() { System.out.println("Speed: 100 km/h"); }
}

public class Dashboard {
    public static void main(String[] args) {
        Vehicle v1 = new ElectricCar();
        Vehicle v2 = new PetrolCar();
        v1.displaySpeed(); v1.displayBattery();
        v2.displaySpeed(); v2.displayBattery();
    }
}

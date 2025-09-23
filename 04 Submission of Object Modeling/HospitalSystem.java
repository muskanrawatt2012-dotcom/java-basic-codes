class Doctor {
    private String name;

    public Doctor(String name) { this.name = name; }

    public void consult(Patient p) {
        System.out.println("Doctor " + name + " is consulting patient " + p.getName());
    }
}

class Patient {
    private String name;

    public Patient(String name) { this.name = name; }
    public String getName() { return name; }
}

class Hospital {
    private String name;
    public Hospital(String name) { this.name = name; }
}

public class HospitalSystem {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Smith");
        Patient p1 = new Patient("Alice");
        Patient p2 = new Patient("Bob");

        d1.consult(p1);
        d1.consult(p2);
    }
}

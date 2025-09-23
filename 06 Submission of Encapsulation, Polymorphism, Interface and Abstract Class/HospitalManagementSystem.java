interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

abstract class Patient {
    private int patientId;
    private String name;
    private int age;

    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    public void getPatientDetails() {
        System.out.println("ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill();
}

// Subclasses
class InPatient extends Patient implements MedicalRecord {
    private double dailyRate;
    private int days;

    public InPatient(int id, String name, int age, double dailyRate, int days) {
        super(id, name, age);
        this.dailyRate = dailyRate;
        this.days = days;
    }

    @Override public double calculateBill() { return dailyRate * days; }
    @Override public void addRecord(String record) { System.out.println("Added record: " + record); }
    @Override public void viewRecords() { System.out.println("Viewing InPatient records..."); }
}

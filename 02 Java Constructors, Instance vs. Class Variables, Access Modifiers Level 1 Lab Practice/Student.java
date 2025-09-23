class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

class PostgraduateStudent extends Student {
    String thesis;

    PostgraduateStudent(int rollNumber, String name, double CGPA, String thesis) {
        super(rollNumber, name, CGPA);
        this.thesis = thesis;
    }

    void displayDetails() {
        System.out.println("Roll: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Thesis: " + thesis);
    }

    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(101, "Krishna", 8.7, "AI Research");
        pg.displayDetails();
    }
}

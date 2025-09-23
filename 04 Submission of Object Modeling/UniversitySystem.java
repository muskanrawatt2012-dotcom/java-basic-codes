import java.util.*;

class Faculty {
    private String name;
    public Faculty(String name) { this.name = name; }
    public void show() { System.out.println("Faculty: " + name); }
}

class DepartmentUni {
    private String deptName;
    public DepartmentUni(String deptName) { this.deptName = deptName; }
    public void show() { System.out.println("Department: " + deptName); }
}

class University {
    private String name;
    private List<DepartmentUni> departments = new ArrayList<>(); // Composition
    private List<Faculty> faculties = new ArrayList<>(); // Aggregation

    public University(String name) { this.name = name; }
    public void addDepartment(DepartmentUni d) { departments.add(d); }
    public void addFaculty(Faculty f) { faculties.add(f); }

    public void show() {
        System.out.println("University: " + name);
        for (DepartmentUni d : departments) d.show();
        for (Faculty f : faculties) f.show();
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        University uni = new University("Global University");
        uni.addDepartment(new DepartmentUni("Computer Science"));
        uni.addDepartment(new DepartmentUni("Physics"));

        Faculty f1 = new Faculty("Dr. Alice");
        Faculty f2 = new Faculty("Dr. Bob");

        uni.addFaculty(f1);
        uni.addFaculty(f2);

        uni.show();
    }
}

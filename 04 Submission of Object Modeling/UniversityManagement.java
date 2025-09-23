import java.util.*;

class Professor {
    private String name;
    public Professor(String name) { this.name = name; }
    public String getName() { return name; }
}

class CourseUni {
    private String name;
    private Professor professor;
    private List<StudentUni> students = new ArrayList<>();

    public CourseUni(String name) { this.name = name; }

    public void assignProfessor(Professor p) {
        this.professor = p;
        System.out.println(p.getName() + " is assigned to " + name);
    }

    public void enroll(StudentUni s) {
        students.add(s);
        System.out.println(s.getName() + " enrolled in " + name);
    }
}

class StudentUni {
    private String name;
    public StudentUni(String name) { this.name = name; }
    public String getName() { return name; }

    public void enrollCourse(CourseUni c) {
        c.enroll(this);
    }
}

public class UniversityManagement {
    public static void main(String[] args) {
        Professor prof = new Professor("Dr. Smith");
        StudentUni s1 = new StudentUni("Alice");

        CourseUni c1 = new CourseUni("OOP");
        c1.assignProfessor(prof);
        s1.enrollCourse(c1);
    }
}

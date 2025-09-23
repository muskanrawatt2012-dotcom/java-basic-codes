import java.util.*;

class Course {
    private String name;
    private List<Student> students = new ArrayList<>();

    public Course(String name) { this.name = name; }

    public void enroll(Student s) {
        students.add(s);
    }

    public void showStudents() {
        System.out.println("Course: " + name);
        for (Student s : students) s.show();
    }
}

class Student {
    private String name;
    private List<Course> courses = new ArrayList<>();

    public Student(String name) { this.name = name; }

    public void enrollCourse(Course c) {
        courses.add(c);
        c.enroll(this); // Association: many-to-many
    }

    public void show() { System.out.println("Student: " + name); }

    public void showCourses() {
        System.out.println(name + " enrolled in:");
        for (Course c : courses) System.out.println("- " + c);
    }
}

class School {
    private String name;
    private List<Student> students = new ArrayList<>(); // Aggregation

    public School(String name) { this.name = name; }

    public void addStudent(Student s) { students.add(s); }
}

public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Greenwood High");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s2.enrollCourse(c1);
        s1.enrollCourse(c2);

        c1.showStudents();
    }
}

import college.student.Student;
import college.faculty.Faculty;

public class MainApp {
    public static void main(String[] args) {
        Student student = new Student("Alice", 101);
        Faculty faculty = new Faculty("Dr. Bob", "Mathematics");

        student.displayStudent();
        faculty.displayFaculty();
    }
}

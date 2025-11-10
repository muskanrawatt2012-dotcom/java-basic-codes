import java.util.List;

public class Course<T extends CourseType> {
    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public void displayCourse() {
        System.out.println(courseName + " - " + courseType.getClass().getSimpleName());
    }

    public static void displayCourses(List<? extends CourseType> courses) {
        for (CourseType c : courses) {
            System.out.println(c.getClass().getSimpleName());
        }
    }
}

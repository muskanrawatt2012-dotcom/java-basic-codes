package ExceptionHandlingAssignment.grades;

public class StudentGradeParser {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "100", "abc", "78"};
        for (String s : grades) {
            try {
                int val = Integer.parseInt(s);
                System.out.println("Parsed grade: " + val);
            } catch (NumberFormatException ex) {
                System.out.println("Invalid grade input: " + s);
            }
        }
    }
}

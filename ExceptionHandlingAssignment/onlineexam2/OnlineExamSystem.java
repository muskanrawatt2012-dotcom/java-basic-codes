package ExceptionHandlingAssignment.onlineexam2;

import java.io.IOException;

public class OnlineExamSystem {
    public static void validateStudent(String regNo) throws InvalidStudentException {
        if (regNo == null || !regNo.equals("2025A12")) {
            throw new InvalidStudentException("Student validation failed");
        }
    }

    public static void submitExam() throws InvalidStudentException, IOException {
        validateStudent("2025A12");
        throw new IOException("Network error while uploading exam file");
    }

    public static void main(String[] args) {
        try {
            submitExam();
        } catch (InvalidStudentException e) {
            System.out.println("Submission failed: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Submission failed: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}

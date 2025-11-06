package ExceptionHandlingAssignment.exam;

import java.time.LocalDateTime;

public class OnlineExamSubmission {
    private static final LocalDateTime DEADLINE = LocalDateTime.of(2025, 11, 6, 23, 30);

    public static void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        }
        if (submissionTime.isAfter(DEADLINE)) {
            throw new LateSubmissionException("Submission failed: late submission");
        }
        System.out.println("Exam submitted successfully!");
    }

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        try {
            submitExam("answers.docx", now); // invalid file format
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            submitExam("answers.pdf", LocalDateTime.of(2025, 11, 7, 0, 0)); // late submission
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            submitExam("answers.pdf", LocalDateTime.of(2025, 11, 6, 22, 0)); // valid submission
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}

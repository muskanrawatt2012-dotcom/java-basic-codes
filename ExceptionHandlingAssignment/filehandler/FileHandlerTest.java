package ExceptionHandlingAssignment.filehandler;

import java.io.IOException;

public class FileHandlerTest {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("nofile.txt");
            System.out.println("File exists.");
        } catch (IOException e) {
            System.out.println("Exception caught in main: " + e.getMessage());
        }
    }
}

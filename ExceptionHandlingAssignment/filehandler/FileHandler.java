package ExceptionHandlingAssignment.filehandler;

import java.io.File;
import java.io.IOException;

public class FileHandler {
    public FileHandler(String fileName) throws IOException {
        File f = new File(fileName);
        if (!f.exists()) {
            throw new IOException("File not found: " + fileName);
        }
    }
}

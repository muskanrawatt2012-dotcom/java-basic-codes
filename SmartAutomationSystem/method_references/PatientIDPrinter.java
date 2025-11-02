package method_references;

import java.util.*;

public class PatientIDPrinter {
    public static void main(String[] args) {
        List<String> patientIDs = List.of("PID1001", "PID1002", "PID1003", "PID1004");

        // Print IDs using method reference
        patientIDs.forEach(System.out::println);
    }
}

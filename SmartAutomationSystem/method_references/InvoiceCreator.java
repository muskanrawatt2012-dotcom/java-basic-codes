package method_references;

import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    @Override
    public String toString() {
        return "Invoice for Transaction: " + transactionId;
    }
}

public class InvoiceCreator {
    public static void main(String[] args) {
        List<String> transactionIds = List.of("TXN001", "TXN002", "TXN003");

        // Constructor reference
        List<Invoice> invoices = transactionIds.stream()
                                               .map(Invoice::new)
                                               .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}

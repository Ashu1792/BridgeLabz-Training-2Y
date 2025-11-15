import java.util.*;
import java.util.stream.Collectors;

class Invoice {
    String transactionId;

    Invoice(String transactionId) {
        this.transactionId = transactionId;
    }

    public String toString() {
        return "Invoice for Txn: " + transactionId;
    }
}

public class invoice {
    public static void main(String[] args) {
        List<String> txnIds = Arrays.asList("TX1001", "TX1002", "TX1003");

        // Constructor reference
        List<Invoice> invoices = txnIds.stream()
                                       .map(Invoice::new)
                                       .collect(Collectors.toList());

        invoices.forEach(System.out::println);
    }
}
import java.util.*;

public class patientId {
    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P001", "P002", "P003");
        patientIDs.forEach(System.out::println); // Method reference instead of lambda
    }
}
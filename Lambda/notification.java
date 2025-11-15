import java.util.*;
import java.util.function.Predicate;

class Alert {
    String type;
    String message;

    Alert(String type, String message) {
        this.type = type;
        this.message = message;
    }

    public String toString() {
        return "[" + type + "] " + message;
    }
}

public class notification {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Critical", "Heart rate abnormal"),
            new Alert("Info", "Appointment reminder"),
            new Alert("Warning", "Low battery on monitor")
        );

        // User prefers only Critical alerts
        Predicate<Alert> criticalOnly = alert -> alert.type.equals("Critical");

        alerts.stream()
              .filter(criticalOnly)
              .forEach(System.out::println);
    }
}
package lambda_expressions;

import java.util.*;
import java.util.function.Predicate;

class Notification {
    String message;
    String type;

    Notification(String message, String type) {
        this.message = message;
        this.type = type;
    }

    @Override
    public String toString() {
        return type + ": " + message;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Notification> notifications = List.of(
                new Notification("Heart rate critical!", "Emergency"),
                new Notification("Time for medicine", "Reminder"),
                new Notification("Daily report ready", "Info")
        );

        Predicate<Notification> emergencyFilter = n -> n.type.equals("Emergency");

        notifications.stream()
                .filter(emergencyFilter)
                .forEach(System.out::println);
    }
}

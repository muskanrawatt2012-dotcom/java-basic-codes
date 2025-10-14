package method_references;

import java.util.*;
import java.util.stream.Collectors;

public class NameUpperCase {
    public static void main(String[] args) {
        List<String> employees = List.of("ravi", "neha", "arjun", "pooja");

        List<String> upperNames = employees.stream()
                                           .map(String::toUpperCase)
                                           .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}

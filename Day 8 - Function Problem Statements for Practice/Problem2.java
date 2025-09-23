import java.time.LocalDate;

public class Problem2 {
    public static void main(String[] args) {
        LocalDate inputDate = LocalDate.of(2023, 9, 23); // Example input

        LocalDate result = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2)
                .minusWeeks(3);

        System.out.println("Original Date: " + inputDate);
        System.out.println("Final Date after arithmetic: " + result);
    }
}

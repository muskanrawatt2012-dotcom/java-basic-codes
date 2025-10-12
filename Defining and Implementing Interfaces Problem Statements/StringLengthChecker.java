import java.util.function.Function;

public class StringLengthChecker {
    public static void main(String[] args) {
        Function<String, Integer> lengthCheck = str -> str.length();
        String msg = "Hello Java Interfaces!";
        System.out.println("Message length: " + lengthCheck.apply(msg));
    }
}

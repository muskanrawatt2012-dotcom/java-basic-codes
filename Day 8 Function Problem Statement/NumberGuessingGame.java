import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        Random rand = new Random();
        return rand.nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback = "";

        System.out.println("Think of a number between 1 and 100!");

        while (!feedback.equalsIgnoreCase("correct")) {
            int guess = generateGuess(low, high);
            System.out.println("Computer guesses: " + guess);
            System.out.print("Is it high, low, or correct? ");
            feedback = sc.next();

            if (feedback.equalsIgnoreCase("high")) {
                high = guess - 1;
            } else if (feedback.equalsIgnoreCase("low")) {
                low = guess + 1;
            }
        }

        System.out.println("Computer guessed it!");
        sc.close();
    }
}

import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int letters = 0, digits = 0, special = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) letters++;
            else if (Character.isDigit(c)) digits++;
            else if (!Character.isWhitespace(c)) special++;
        }

        System.out.println("Letters: " + letters);
        System.out.println("Digits: " + digits);
        System.out.println("Special characters: " + special);
    }
}

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("\\s+", "");
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.println(isPalindrome(input) ? "Palindrome" : "Not a Palindrome");
        sc.close();
    }
}

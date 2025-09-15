import java.util.Scanner;

public class QuotientRemainder {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[]{quotient, remainder};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int divisor = sc.nextInt();
        int[] qr = findRemainderAndQuotient(number, divisor);
        System.out.println("The Quotient is " + qr[0] + " and Remainder is " + qr[1] + " of two number " + number + " and " + divisor);
    }
}

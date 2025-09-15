import java.util.Scanner;

public class ChocolateDivision {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int each = number / divisor;
        int remaining = number % divisor;
        return new int[]{each, remaining};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chocolates = sc.nextInt();
        int children = sc.nextInt();
        int[] res = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + res[0] + " chocolates and remaining chocolates are " + res[1]);
    }
}

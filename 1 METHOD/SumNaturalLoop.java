import java.util.Scanner;

public class SumNaturalLoop {
    public static long sumNatural(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum = sumNatural(n);
        System.out.println("The sum of " + n + " natural numbers is " + sum);
    }
}

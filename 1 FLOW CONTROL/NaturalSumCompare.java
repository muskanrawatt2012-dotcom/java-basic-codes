import java.util.Scanner;

public class NaturalSumCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int formula = n * (n + 1) / 2;
            int sum = 0, i = 1;
            while (i <= n) {
                sum += i;
                i++;
            }
            System.out.println("Formula sum: " + formula + ", While loop sum: " + sum);
            System.out.println("Both are equal? " + (formula == sum));
        } else {
            System.out.println("The number " + n + " is not a natural number");
        }
    }
}

import java.util.Scanner;

public class NumberSign {
    public static int checkNumber(int n) {
        if (n < 0) return -1;
        if (n > 0) return 1;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = checkNumber(n);
        System.out.println("The number is " + n + " and result is " + res);
    }
}

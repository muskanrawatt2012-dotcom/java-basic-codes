import java.util.Scanner;

public class Handshakes {
    public static long handshakeCount(long n) {
        return (n * (n - 1)) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long result = handshakeCount(n);
        System.out.println("The maximum number of possible handshakes is " + result);
    }
}

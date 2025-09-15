import java.util.Scanner;

public class TriangleRounds {
    public static int computeRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        if (perimeter <= 0) return 0;
        double distance = 5000.0;
        return (int) Math.ceil(distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        int rounds = computeRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds to run 5 km");
    }
}

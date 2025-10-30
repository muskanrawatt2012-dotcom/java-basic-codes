import static java.lang.Math.*;

public class StaticImportDemo {
    public static void main(String[] args) {
        double x = 25.0, y = 5.0;
        System.out.println("sqrt(25): " + sqrt(x));
        System.out.println("pow(5, 2): " + pow(y, 2));
        System.out.println("max(3, 7): " + max(3, 7));
        System.out.println("min(3, 7): " + min(3, 7));
        System.out.println("abs(-10): " + abs(-10));
    }
}

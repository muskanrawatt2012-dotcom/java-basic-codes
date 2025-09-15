import java.util.Scanner;

public class TrigFunctions {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        double sin = Math.sin(rad);
        double cos = Math.cos(rad);
        double tan = Math.tan(rad);
        return new double[]{sin, cos, tan};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angle = sc.nextDouble();
        double[] vals = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + vals[0]);
        System.out.println("Cosine = " + vals[1]);
        System.out.println("Tangent = " + vals[2]);
    }
}

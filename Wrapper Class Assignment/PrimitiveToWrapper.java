import java.util.Scanner;

public class PrimitiveToWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int primitive = sc.nextInt();
        Integer wrapper = Integer.valueOf(primitive);

        System.out.println("Primitive value: " + primitive);
        System.out.println("Wrapper value: " + wrapper);
    }
}

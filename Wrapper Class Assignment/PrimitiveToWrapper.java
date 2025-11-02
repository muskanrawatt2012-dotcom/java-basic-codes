import java.util.Scanner;

public class PrimitiveToWrapper {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    int n = sc.nextInt();
    Integer obj = Integer.valueOf(n);
    System.out.println("Primitive int: " + n);
    System.out.println("Integer object: " + obj);
    sc.close();
  }
}

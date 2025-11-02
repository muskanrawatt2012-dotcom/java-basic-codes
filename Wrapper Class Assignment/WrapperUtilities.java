public class WrapperUtilities {
  public static void main(String[] args) {
    int p = Integer.parseInt("123");
    double q = Double.parseDouble("3.14");
    boolean r = Boolean.parseBoolean("true");
    String bin = Integer.toBinaryString(10);
    boolean isDigit = Character.isDigit('5');
    char upper = Character.toUpperCase('a');

    System.out.println("parseInt: " + p);
    System.out.println("parseDouble: " + q);
    System.out.println("parseBoolean: " + r);
    System.out.println("toBinaryString: " + bin);
    System.out.println("Character.isDigit('5'): " + isDigit);
    System.out.println("Character.toUpperCase('a'): " + upper);
  }
}

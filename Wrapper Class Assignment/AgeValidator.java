public class AgeValidator {
  public static boolean isValidAdult(String ageStr) {
    try {
      int age = Integer.parseInt(ageStr.trim());
      return age >= 18;
    } catch (NumberFormatException e) {
      return false;
    }
  }

  public static void main(String[] args) {
    System.out.println(isValidAdult("20"));
    System.out.println(isValidAdult("17"));
    System.out.println(isValidAdult("abc"));
    System.out.println(isValidAdult("  25 "));
  }
}

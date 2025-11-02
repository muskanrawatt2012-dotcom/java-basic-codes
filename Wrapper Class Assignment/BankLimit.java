public class BankLimit {
  public static double remainingLimit(Double dailyLimit, double used) {
    double limit = (dailyLimit == null) ? 0.0 : dailyLimit;
    double rem = limit - used;
    return rem < 0 ? 0.0 : rem;
  }

  public static void main(String[] args) {
    System.out.println(remainingLimit(1000.0, 250.5));
    System.out.println(remainingLimit(null, 100));
  }
}

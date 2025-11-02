public class WrapperToPrimitive {
  public static void main(String[] args) {
    Double dObj = 45.67;
    double d = dObj.doubleValue();
    int i = (int) d;
    System.out.println("Double object: " + dObj);
    System.out.println("double primitive: " + d);
    System.out.println("int (cast): " + i);
  }
}

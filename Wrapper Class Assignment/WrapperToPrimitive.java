public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double wrapper = 45.67;
        double d = wrapper.doubleValue();
        int i = d.intValue();

        System.out.println("Double value: " + d);
        System.out.println("Int value: " + i);
    }
}

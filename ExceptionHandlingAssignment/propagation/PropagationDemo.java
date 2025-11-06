package ExceptionHandlingAssignment.propagation;

public class PropagationDemo {
    public static void methodB(String s) {
        try {
            int num = Integer.parseInt(s); // May cause NumberFormatException
            System.out.println("Parsed number: " + num);
            String text = null;
            System.out.println(text.length()); // May cause NullPointerException
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught in methodB");
        }
    }

    public static void methodA(String s) {
        try {
            methodB(s);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException propagated and caught in methodA");
        }
    }

    public static void main(String[] args) {
        methodA("abc");     // Triggers NumberFormatException, caught in methodB
        methodA("123");     // Triggers NullPointerException, propagated and caught in methodA
    }
}

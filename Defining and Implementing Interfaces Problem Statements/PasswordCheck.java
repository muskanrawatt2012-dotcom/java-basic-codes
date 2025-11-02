interface SecurityUtils {
    static boolean isStrongPassword(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[A-Z].*") && pwd.matches(".*[0-9].*");
    }
}

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println(SecurityUtils.isStrongPassword("Hello123")); // true
    }
}

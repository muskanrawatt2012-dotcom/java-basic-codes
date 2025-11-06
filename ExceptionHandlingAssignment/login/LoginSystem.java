package ExceptionHandlingAssignment.login;

import java.util.Scanner;

public class LoginSystem {
    private static final String VALID_USER = "admin";
    private static final String VALID_PASS = "Secret@123";

    public static void validate(String user, String pass) throws InvalidCredentialsException {
        if (!VALID_USER.equals(user) || !VALID_PASS.equals(pass)) {
            throw new InvalidCredentialsException("Invalid username or password.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ok = false;
        while (!ok) {
            System.out.print("Username: ");
            String u = sc.nextLine();
            System.out.print("Password: ");
            String p = sc.nextLine();
            try {
                validate(u, p);
                System.out.println("Login successful!");
                ok = true;
            } catch (InvalidCredentialsException e) {
                System.out.println(e.getMessage() + " Try again.");
            }
        }
        sc.close();
    }
}

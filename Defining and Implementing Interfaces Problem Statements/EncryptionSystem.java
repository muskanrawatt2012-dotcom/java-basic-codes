interface SensitiveData {}

class UserCredentials implements SensitiveData {
    String username = "admin";
    String password = "12345";
}

public class EncryptionSystem {
    public static void main(String[] args) {
        UserCredentials u = new UserCredentials();
        if (u instanceof SensitiveData)
            System.out.println("Encrypting sensitive data...");
    }
}

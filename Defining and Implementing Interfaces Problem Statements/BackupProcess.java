import java.io.Serializable;

class BackupData implements Serializable {
    String data = "User Backup Information";
}

public class BackupProcess {
    public static void main(String[] args) {
        BackupData b = new BackupData();
        System.out.println("Backup ready for: " + b.data);
    }
}

import java.util.*;

public class RemoveChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char ch = sc.next().charAt(0);
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) if (c != ch) sb.append(c);
        System.out.println(sb.toString());
    }
}

import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();
        String[] words = sentence.split("\\s+");
        String longest = "";
        for (String w : words) if (w.length() > longest.length()) longest = w;
        System.out.println(longest);
    }
}

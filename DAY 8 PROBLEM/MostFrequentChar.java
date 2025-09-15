import java.util.*;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int[] freq = new int[256];
        for (char c : str.toCharArray()) freq[c]++;
        int max = 0; char res = ' ';
        for (int i = 0; i < 256; i++) {
            if (freq[i] > max) {
                max = freq[i];
                res = (char) i;
            }
        }
        System.out.println(res);
    }
}

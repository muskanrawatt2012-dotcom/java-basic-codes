import java.util.Scanner;

public class VowelConsonantDisplay {
    public static String checkChar(char c){
        if(c>='A'&&c<='Z') c=(char)(c+32);
        if(c>='a'&&c<='z'){
            if("aeiou".indexOf(c)>=0) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static String[][] analyze(String s){
        String[][] res=new String[s.length()][2];
        for(int i=0;i<s.length();i++){
            res[i][0]=String.valueOf(s.charAt(i));
            res[i][1]=checkChar(s.charAt(i));
        }
        return res;
    }
    public static void display(String[][] arr){
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i][0]+" -> "+arr[i][1]);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[][] data=analyze(s);
        display(data);
    }
}

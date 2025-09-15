import java.util.Scanner;

public class LowercaseDemo {
    public static String toLower(String s){
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='A' && c<='Z'){
                c=(char)(c+32);
            }
            res+=c;
        }
        return res;
    }
    public static boolean compare(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res1=toLower(s);
        String res2=s.toLowerCase();
        System.out.println("Custom Lower: "+res1);
        System.out.println("Built-in Lower: "+res2);
        System.out.println("Equal? "+compare(res1,res2));
    }
}

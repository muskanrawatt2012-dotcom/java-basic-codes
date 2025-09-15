import java.util.Scanner;

public class SubstringCharAt {
    public static String makeSub(String s,int start,int end){
        String sub="";
        for(int i=start;i<end;i++){
            sub+=s.charAt(i);
        }
        return sub;
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
        String s=sc.next();
        int start=sc.nextInt();
        int end=sc.nextInt();
        String sub1=makeSub(s,start,end);
        String sub2=s.substring(start,end);
        System.out.println("Custom Substring: "+sub1);
        System.out.println("Built-in Substring: "+sub2);
        System.out.println("Equal? "+compare(sub1,sub2));
    }
}

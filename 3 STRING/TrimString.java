import java.util.Scanner;

public class TrimString {
    public static int[] findBounds(String s){
        int start=0,end=s.length()-1;
        while(start<=end && s.charAt(start)==' ') start++;
        while(end>=start && s.charAt(end)==' ') end--;
        return new int[]{start,end};
    }
    public static String substring(String s,int start,int end){
        String res="";
        for(int i=start;i<=end;i++) res+=s.charAt(i);
        return res;
    }
    public static boolean compare(String a,String b){
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int[] b=findBounds(s);
        String custom=substring(s,b[0],b[1]);
        String builtin=s.trim();
        System.out.println("Custom: '"+custom+"'");
        System.out.println("Built-in: '"+builtin+"'");
        System.out.println("Equal? "+compare(custom,builtin));
    }
}

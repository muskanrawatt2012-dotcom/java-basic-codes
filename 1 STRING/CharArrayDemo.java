import java.util.Scanner;

public class CharArrayDemo {
    public static char[] makeArray(String s){
        char[] arr=new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i]=s.charAt(i);
        }
        return arr;
    }
    public static boolean compare(char[] a,char[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char[] arr1=makeArray(s);
        char[] arr2=s.toCharArray();
        System.out.println("Equal? "+compare(arr1,arr2));
    }
}

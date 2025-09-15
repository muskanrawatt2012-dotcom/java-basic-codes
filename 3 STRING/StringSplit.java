import java.util.Scanner;

public class StringSplit {
    public static int getLength(String s){
        int count=0;
        try{while(true){s.charAt(count);count++;}}catch(Exception e){}
        return count;
    }
    public static String[] customSplit(String s){
        int n=getLength(s);
        int spaces=1;
        for(int i=0;i<n;i++) if(s.charAt(i)==' ') spaces++;
        String[] words=new String[spaces];
        int w=0; String temp="";
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(c==' '){words[w++]=temp;temp="";}
            else temp+=c;
        }
        words[w]=temp;
        return words;
    }
    public static boolean compare(String[] a,String[] b){
        if(a.length!=b.length) return false;
        for(int i=0;i<a.length;i++) if(!a[i].equals(b[i])) return false;
        return true;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] arr1=customSplit(s);
        String[] arr2=s.split(" ");
        System.out.println("Equal? "+compare(arr1,arr2));
    }
}

import java.util.Scanner;

public class ShortLongWord {
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=customSplit(s);
        String shortest=words[0],longest=words[0];
        for(String word:words){
            if(getLength(word)<getLength(shortest)) shortest=word;
            if(getLength(word)>getLength(longest)) longest=word;
        }
        System.out.println("Shortest: "+shortest);
        System.out.println("Longest: "+longest);
    }
}

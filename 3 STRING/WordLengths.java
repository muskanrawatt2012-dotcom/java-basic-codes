import java.util.Scanner;

public class WordLengths {
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
    public static String[][] wordWithLength(String[] words){
        String[][] res=new String[words.length][2];
        for(int i=0;i<words.length;i++){
            res[i][0]=words[i];
            res[i][1]=String.valueOf(getLength(words[i]));
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String[] words=customSplit(s);
        String[][] data=wordWithLength(words);
        for(int i=0;i<data.length;i++)
            System.out.println(data[i][0]+" -> "+Integer.parseInt(data[i][1]));
    }
}

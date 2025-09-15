import java.util.Scanner;

public class StringIndexDemo {
    public static void generate(String s){
        System.out.println(s.charAt(s.length()+1));
    }
    public static void handle(String s){
        try{
            System.out.println(s.charAt(s.length()+1));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Exception Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generate(s);
        handle(s);
    }
}

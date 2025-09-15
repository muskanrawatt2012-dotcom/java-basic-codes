import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void generate(String s){
        System.out.println(s.substring(5,2));
    }
    public static void handle(String s){
        try{
            System.out.println(s.substring(5,2));
        }catch(IllegalArgumentException e){
            System.out.println("IllegalArgumentException Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generate(s);
        handle(s);
    }
}

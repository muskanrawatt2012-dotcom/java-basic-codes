import java.util.Scanner;

public class NumberFormatDemo {
    public static void generate(String s){
        int num=Integer.parseInt(s);
        System.out.println(num);
    }
    public static void handle(String s){
        try{
            int num=Integer.parseInt(s);
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("NumberFormatException Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        //generate(s);
        handle(s);
    }
}

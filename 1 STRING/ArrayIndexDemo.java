import java.util.Scanner;

public class ArrayIndexDemo {
    public static void generate(String[] arr){
        System.out.println(arr[arr.length]);
    }
    public static void handle(String[] arr){
        try{
            System.out.println(arr[arr.length]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        //generate(arr);
        handle(arr);
    }
}

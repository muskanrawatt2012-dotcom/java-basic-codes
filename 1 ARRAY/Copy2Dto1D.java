import java.util.Scanner;
public class Copy2Dto1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(), cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix[i][j] = sc.nextInt();
        int[] arr = new int[rows*cols];
        int index = 0;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                arr[index++] = matrix[i][j];
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i] + " ");
    }
}

package mycap;
import java.util.*;
public class MyCap {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter order of square matrix:");
    int n = input.nextInt();
    int[][] x = new int[n][n];
    int[][] y = new int[n][n];
    int[][] z = new int[n][n];
    System.out.println("Please enter first matrix - ");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                x[i][j] = input.nextInt();
    System.out.println("Please enter second matrix - ");
        for(int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                y[i][j] = input.nextInt();
    for(int i = 0; i < n; i++)
        for(int j = 0; j < n; j++)
            z[i][j] = x[i][j] + y[i][j];
    System.out.println("Sum of the given matrices is ");
    for(int i = 0; i < n; i++)
    {
        for(int j = 0; j < n; j++)
            System.out.print(z[i][j]+" ");
        System.out.println();
    }
    input.close();
}

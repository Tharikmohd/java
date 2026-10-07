package sample;
import java.util.*;

public class Array2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of label: ");
        int label = sc.nextInt();

        System.out.print("Enter the size of row: ");
        int row = sc.nextInt();

        System.out.print("Enter the size of columns: ");
        int col = sc.nextInt();

        int[][][] matrix = new int[label][row][col];

        System.out.println("Enter the elements:");



        // Input
        for(int i = 0; i < label; i++)
        {
            for(int j = 0; j < row; j++)
            {
                for(int k = 0; k < col; k++)
                {
                    matrix[i][j][k] = sc.nextInt();
                }
            }
        }

        System.out.println("\nElements are:");

        // Output
        for(int i = 0; i < label; i++)
        {
            System.out.println("Label " + (i + 1));

            for(int j = 0; j < row; j++)
            {
                for(int k = 0; k < col; k++)
                {
                    System.out.print(matrix[i][j][k] + "\t");
                }
                System.out.println();
            }

            System.out.println();
        }

     }
}
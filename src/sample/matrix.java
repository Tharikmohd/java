package sample;
import java.util.*;

public class matrix 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of row : ");
        int row = sc.nextInt();

        System.out.print("Enter the size of column : ");
        int col = sc.nextInt();


        int [][] matrix = new int[row][col];

        System.out.println("Enter the elements : ");

        for(int i =0; i<row; i++)
        {
            for(int j =0; j<col; j++)
            {
                matrix[i][j] =sc.nextInt();
            }

        }

        System.out.println("Elements are : ");

        for(int i=0; i<row; i++)
        {
            for(int j=0; j<col; j++)
            {
                System.out.print(matrix[i][j] +"\t");
            }

            System.out.print("\n");
        }

    }



        

}

package sample;
import java.util.*;

public class PRIMEEVEN 
{
    

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row size : ");
        int row = sc.nextInt();
        System.out.println("Enter the column size : ");
        int column = sc.nextInt();

        System.out.println("Enter the first number of elements : ");
        int n = sc.nextInt();
        System.out.println("Enter the last number of elements : ");
        int l = sc.nextInt();

        int [][] matrix  = new int [row][column];
       int r =0;
       int c = 0;

        for(int i =n; i<=l && r < row; i++)
        {

                if(i % 2 != 0)
                {
                    matrix[r][c] = i;
                    c++;
                    
                    if(c ==column)
                    {
                        c =0;
                        r++;
                    }
                }
             }


        System.out.println("===Matrix===");

        for(int i=0; i < row; i++)
        {
            for(int j=0; j<column; j++)
            {
                System.out.print(matrix[i][j] +"\t");
            }

            System.out.print("\n");
        }



    }

}


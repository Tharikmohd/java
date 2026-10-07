package sample;
import java.util.*;

public class array 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of row : ");
        int r = sc.nextInt();

        System.out.println("Enter the size of column : ");
        int c = sc.nextInt();

        int [] [] arr = new int [r][c];

        System.out.println("Enter the elements : ");

        int i,j;

        for (i=0; i<r;i++)
        {
            for (j=0; j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }

        }

        System.out.println("Elements are : ");

        /*for(i=0;i<r;i++)
        {
            for (j=0;j<c;j++)
            {
                System.out.print(arr[i][j] +"\t");
            }

            System.out.println("\n");*/

            for(int[] x : arr)
            {
                for(int val : x)
                {
                    System.out.print( val+ "\t");

                }
                System.out.println("\n");

            }

            System.out.println("Enter the row index for Max number :");
            int row_index = sc.nextInt();
            
            
            if(row_index>=0 && row_index< r)
            {
                int max = arr[row_index][0];
                
                for(int value : arr[row_index])
                {
                    if (value > max)
                    {
                        max=value;
                    }

                }

                System.out.println("Maximum of row " +row_index+ ":" +max);
            }

            else
            {
                System.out.println("Invalid index number!!");

            }


            System.out.println("Enter the Column index number : ");
            int col_index = sc.nextInt();

            if(col_index>=0 && col_index < c)
            {
                int maxc = arr[0][col_index];
                
                for( i=0;i<r;i++)
                {
                    if(arr[i][col_index] > maxc)
                    {
                        maxc = arr[i][col_index];
                    }

                    System.out.println("Maximum of column values : "+col_index+  ":" + maxc);
                }

                
            }

            else
            {
                System.out.println("Invalid Column Index!!");
            }
            


        }

        

        
    
    }


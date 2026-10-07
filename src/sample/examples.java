package sample;
import java.util.*;

public class examples
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of stars : ");
        int num = sc.nextInt();

        /*for(int i=0; i<=num; i++)
        {
            for(int j=1; j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/

            for(int i =0; i<=num; i++)
            {
                for(int j=1; j<=num-1; j++)
                {
                    System.out.print(" ");
                }

                for(int j=1; j<=i; j++)
                {
                    System.out.print("*");
                }

                System.out.println();

                
            }

            

    }


}

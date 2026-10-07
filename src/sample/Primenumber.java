package sample;
import java.util.*;


public class Primenumber 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        int starting_number = sc.nextInt();

        System.out.println("Enter Last Number");
        int ending_number = sc.nextInt();

        for(int i= starting_number; i<=ending_number; i++)
        {
            int count =0;
            for (int j=1; j<=i; j++)
            {
                if(i%j==0)
                {
                    count++;
                }
            }

            if(count==2)
            {
                System.out.println(i);
            }
        }


    }


}

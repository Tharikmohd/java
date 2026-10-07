package sample;
import java.util.*;

public class Switch 
{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the First number : ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second number :"); 
            int num2 = sc.nextInt();

            System.out.println("======= Select your Choice======");
            //System.out.print("\n");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Modulus");

            int choice = sc.nextInt();

            

            switch (choice) 
            {
                case 1:
                    int a = num1 + num2;
                    System.out.println("Additional value of given two numbers : " +a );
                    
                    break;
                case 2:
                    int b = num1-num2;
                    System.out.println("Subtraction of given two values : " +b);

                    break;
                case 3:
                    int c = num1*num2;
                    System.out.println("Multiplication of given two value : "+c);

                    break;
                case 4:
                    if(num2!=0)
                    {
                        int e = num1/num2;
                        System.out.println("Division of given two values : "+e);

                    }
                    else
                    {
                        System.out.println("Denominator could not be Zero!!!... Please provide valid Number!!");
                    }

                    break;
                case 5:
                    if(num2!=0)
                    {
                        int d = num1%num2;
                        System.out.println("MOdulus(Reminder) of given two values : "+d);

                    }
                    else
                    {
                        System.out.println("Denominator could not be Zero!!!... Please provide valid Number!!");
                    } 

                    break;

                default:
                    throw new AssertionError();
            }

            
        }
    }

}

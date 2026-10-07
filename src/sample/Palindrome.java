package sample;
import java.util.*;


public class Palindrome 
{
    public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the word");
            String word = sc.next();

            String originalword = word.toLowerCase().replace(" ","");
            String reverseword = "";

            for(int i = word.length()-1; i>=0; i--)
            {
                reverseword = reverseword+ word.charAt(i);

            }

            if (word.equals(reverseword))
            {
                System.out.println("It is a Palindrome : " +word);
            }
            else
            {
                System.out.println("It is not a Palindrome : "+word);
            }

            Fibonacci.main(args);

        }
    

}

class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a value : ");
        int first = sc.nextInt();
        System.out.println("Enter the last value : ");
        int last = sc.nextInt();

          System.out.println("Fibonacci Value");

        int a = first;
        int b=2;
        int i = 1;

        while(i<=last)
        {
          
            System.out.println(a);
            int c= a+b;
            a=b;
            b=c;
            i++;
        }
    }
}

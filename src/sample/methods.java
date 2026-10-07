package sample;
import java.util.*;

public class methods 
{
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        methods obj = new methods();
        obj.contains();
        System.out.println("Count = " + obj.letter());
        obj.multiplication();
        System.out.println("Count of vowel : "+obj.vowel());
         obj.primeNumber(0, 100);
        System.out.println("area of the circle : " +obj.Area());
        System.out.println("The largest number in given number : " +obj.largestNumber());
        System.out.println("Factorial value of given number "  +":"+" " +obj.factorial());
        System.out.println("Given number of reverse order : " +obj.reverse());
        obj.primeNumber(0);
        
    }

    //without arg and without return type

    public void contains()
    {
        System.out.println("Enter the word : ");
        String word = sc.next();

       
            if(word.contains("a"))
            {
                System.out.println("'A' contains in a given word..." );

            }
            else
            {
                System.out.println("'A' word not contains in a given word...");

            }
        
    }

    //without arg with return type

    public int letter ()
    {
        System.out.println("Enter the word : ");
        String word = sc.next().toLowerCase();

        int count =0;
        
        for(int i=1; i<word.length(); i=i+2)
        {
            if(word.charAt(i) == 'a')
            {
                count++; 
            }


        }

        return count;

    }

    public void multiplication()
    {
        System.out.println("Enter the number for table multiplication :");
        int num = sc.nextInt();
        System.out.println("Enter the last number for multiplication : ");
        int untill = sc.nextInt();

        System.out.println("Table of " + num);

        for(int i = 1; i<=untill; i++)
        {
            
            System.out.println(num+"x"+i +"=" +(num*i));

        }
    }




    //without arg with return type
    public int vowel()
    {
        System.out.println("Enter the word : ");
        String word = sc.next().toLowerCase().replace(" ", "");

        int i;
        int count =0;
        for(i=0;i<word.length();i++)
        {
            if(word.charAt(i) =='a' || word.charAt(i) =='e' || word.charAt(i) == 'i' || 
                        word.charAt(i) =='o' || word.charAt(i) =='u')
            {
                count ++;
            }   
        }

        return count;

    } 

    //with arg without return type
    
    public void primeNumber(int a, int b)
    {
        for(int i= a; i<=b;i++)
        {
            int count =0;
            for(int j=1; j<=i; j++)
            {
                if(i%j ==0)
                {
                    count++;
                }
            }
            if(count ==2)
            {
                System.out.print(i + " ");
            }
            
        }
        System.out.println("\n");

    }

    public double Area()
    {
        final double pi = 3.14;
        System.out.println("Enter the radius of the circle : ");
        int r = sc.nextInt();

        double area = pi*r*r;

        return area;

    }

    public int largestNumber()
    {
        System.out.println("Enter the 3 numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>=b && a>=c)
        {
            return a;
        }
        else if(b>=c && b>=a)
        {
            return b;
        }
        else
        {
            return c;
        }

    }

    public int factorial()
    {
        System.out.println("Enter the factorial number : ");
        int num = sc.nextInt();

        int fact = 1;
        for(int i =1; i<=num; i++)
        {
            fact = fact*i;
        }

        return fact;
    }

    public int reverse()
    {
        System.out.println("Enter the number : ");
        int num1 = sc.nextInt();

        int rev = 0;

        while(num1!=0)
        {
            int digit =num1%10;
            rev = rev*10 + digit;

            num1 = num1/10;

        }
        return rev;
    }

    public void primeNumber(int a)
    {
        System.out.println("Enter the number : ");
        int num2 = sc.nextInt();

        int count =0;
        for(int i=0; i<=num2; i++)
        {
            if(i%num2 ==0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println(num2  +":" +" Its a Prime NUmber..");
        }
        else
        {
            System.out.println(num2+ ":" +"Its not a prime Number...");
        }

    }

        
    
    
}

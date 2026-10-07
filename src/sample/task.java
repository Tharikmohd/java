package sample;
import java.util.*;


public class task 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word :");
        String user_word = sc.next();
        String word = user_word.toLowerCase().replace(" ", "");
        String revesedword = "";

        for (int i = word.length()-1;i>=0;i--)
        {
            revesedword = revesedword+word.charAt(i);

        }

        if (word.equals(revesedword))
        {
            System.out.println(word+ " : It is a palidrome ");
        }
        else{
            System.out.println(word+ " : It is not a palidrome");
        }
    }

}

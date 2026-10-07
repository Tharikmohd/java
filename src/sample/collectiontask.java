package sample;

import java.util.*;

public class collectiontask 
{
    public static void main(String[] args)
    {
        List<String> fruits = new ArrayList<String>();
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pomegranates");

        System.out.println(fruits);

        for(String f : fruits)
        {
            System.out.println(f);
        }

        // Find Max length of elements
        System.out.println("Max length of fruits list");
        String max ="";
        for(String m : fruits)
        {
            if(m.length()>max.length())
            {
                max = m; 
            }
            
        }
        System.out.println(max + "-" +max.length());


        //Print unique list

        System.out.println("Unique List :");

        List<String> uniqueList = new ArrayList<>();

        for(String u : fruits)
        {
            if(!uniqueList.contains(u))
            {
                uniqueList.add(u);
                System.out.println(u);
            }
            
        }

        // Print last 3 elements

       

        System.out.println("Last three elements");

            for(int l = fruits.size()-3; l<fruits.size(); l++)
            {
                String y = fruits.get(l);
                System.out.println(y);
            }
            

        

    }

}

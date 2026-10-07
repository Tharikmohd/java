package sample;

import java.util.*;

public class collection 
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Tata");
        cars.add("Mahindra");
        cars.add("Skoda");
        cars.add("Honda");

        System.out.println(cars);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car name : ");

        String carget = sc.next();
        boolean found = true;

        for (Object car : cars) 
        {
            if(car.equals(carget))
            {
                found = true;
                break;
            } 
            
        }
        if(found)
            {
                cars.remove(carget);
                System.out.println(cars);
            }
            else
            {
                System.out.println(carget +"name not listed ");
            }
            

    }

}

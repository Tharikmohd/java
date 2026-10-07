package sample;
import java.util.*;

public class restaurant 
{
    public static int total;

    public static void main(String[] arg)
    {
        food f = new food();
    f.ftype();

    if(f.choice == 1)
    {
        breakFast bf = new breakFast();
        bf.choice = f.choice;
        bf.order();

        restaurant.total = bf.total;
    }
    else if(f.choice == 2)
    {
        lunch lu = new lunch();
        lu.choice = f.choice;
        lu.order();

        restaurant.total = lu.total;
    }
    else if(f.choice == 3)
    {
        dinner d = new dinner();
        d.choice = f.choice;
        d.order();

        restaurant.total = d.total;
    }
    else
    {
        return;
    }

    String Coupon = f.generateCoupon();

    if(Coupon.length() == 4)
    {
        System.out.println("Sorry Your not eligible for Coupon");
        System.out.println("Better luck next time");
        System.out.println("Total Bill Amount ₹" + restaurant.total);
    }
    else if(Coupon.length() == 5)
    {
        int discount = restaurant.total * 10 / 100;
        int finalamount = restaurant.total - discount;

        System.out.println("Total Bill Amount ₹" + restaurant.total);
        System.out.println("Coupon Code: " + Coupon);
        System.out.println("Congrats you are eligible for coupon");
        System.out.println("Your Discount amount ₹" + discount);
        System.out.println("Your Final amount ₹" + finalamount);
    }
    else if(Coupon.length() == 6)
    {
        int discount = restaurant.total * 20 / 100;
        int finalamount = restaurant.total - discount;

        System.out.println("Total Bill Amount ₹" + restaurant.total);
        System.out.println("Coupon Code: " + Coupon);
        System.out.println("Congrats you are eligible for coupon");
        System.out.println("Your Discount amount ₹" + discount);
        System.out.println("Your Final amount ₹" + finalamount);
    }

        
    }

}

class food
{

    Scanner sc = new Scanner(System.in);
    int choice;

    public void ftype()
    {
        System.out.println("Please select your choice");
        System.out.println("1.Breakfast");
        System.out.println("2.Lunch");
        System.out.println("3.Dinner");

        choice = sc.nextInt();

        switch(choice)
        {
            case 1:
                {
                    System.out.println("Breakfast Menu");
                    System.out.println("Idly -  ₹20");
                    System.out.println("2.Dosa - ₹40");
                    System.out.println("3.Pooriset - ₹40");
                    System.out.println("4.Pongal - ₹50");
                    System.out.println("5.Medu Vada - ₹12");
                    System.out.println("6.Masala Vada - ₹12");
                    System.out.println("7.Masala Dosa - ₹70");
                    System.out.println("8.Uthappam - ₹50");
                    break;
                }
            case 2:
                {
                    System.out.println("Lunch Menu");
                    System.out.println("1. Veg Meals - ₹80");
                    System.out.println("2. Chicken Briyani - ₹120");
                    System.out.println("3. Chicken Friendrice - ₹110");
                    System.out.println("4. Mutton Briyani - ₹240");
                    System.out.println("5. Egg Briyani - ₹90");
                    System.out.println("6. Egg Friedrice -₹100");
                    System.out.println("7. Veg Friedrice - ₹90");
                    System.out.println("8. Non-veg Meals - ₹ 100");
                    break;
                }
            case 3:
                {
                    System.out.println("Dinner Menu");
                    System.out.println("Idly -  ₹20");
                    System.out.println("2.Dosa - ₹40");
                    System.out.println("3.Parotta - ₹20");
                    System.out.println("4.Chapathi - ₹15");
                    System.out.println("5.Egg Friedrice -₹100");
                    System.out.println("6.Veg Friedrice - ₹90");
                    System.out.println("7.Chicken Friendrice - ₹110");
                    System.out.println("8.Chicken Noodles - ₹110");
                    break;
                }
            default:
                System.out.println("Invalid Input Thank you....");
        }
    }

     public String generateCoupon()
    {
        String num = "qweertyuioplkjhgfdsazxcvbnmQWERTYUIOPLKJHGFDSAZXCVBNM";
        int i;
        Random rand = new Random();
        int length = rand.nextInt(3) +4;
        String Coupon = "";

        for(i=0; i<length;i++)
        {
            int ran = rand.nextInt(num.length());
            Coupon += num.charAt(ran);

        }

        return Coupon;

    }
}

class breakFast extends food
{
    public String order;
    public int idlyprice = 20;
    public int dosaprice = 40;
    public int pongalprice = 50;
    public int pooriprice = 40;
    public int mvadaprice = 12;
    public int mavadaprice = 12;
    public int uthappamprice = 50;
    public int mdosaprice = 70;

    Scanner sc = new Scanner(System.in);

    @SuppressWarnings("UnnecessaryReturnStatement")
    public void order()
    {
         if(choice !=1)
		 {
			 System.out.println("Thanks for Choosing us...");
		 }
			 
			 System.out.println("Do you want to order Foods...");
				
				String order = sc.next();
            
         
		if(order.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the number of Idly : ");
			int idlyCount = sc.nextInt();
			System.out.println("Enter the number of Dosa : ");
			int dosaCount = sc.nextInt();
			System.out.println("Enter the number of Poori : ");
			int pooriCount = sc.nextInt();
            System.out.println("Enter the number of Pongal : ");
			int pongalCount = sc.nextInt();
			System.out.println("Enter the number of Masala Dosa : ");
			int mdosaCount = sc.nextInt();
			System.out.println("Enter the number of Medu Vada : ");
			int mvadaCount = sc.nextInt();
            System.out.println("Enter the number of Masala Vada : ");
			int mavadaCount = sc.nextInt();
			System.out.println("Enter the number of Uthappam : ");
			int uthappamCount = sc.nextInt();
			
			 int total = (idlyCount*idlyprice)+(dosaCount*dosaprice)+(pooriCount*pooriprice)+(pongalCount*pongalprice)+(mdosaCount*mdosaprice)+(mvadaCount*mvadaprice)+(mavadaCount*mavadaprice)+(uthappamCount*uthappamprice);
			
		}
		else
		{
			System.out.println("Thanks for your Valuable time. you can Quit now....!!!!");
            return;
		}

    }

    public void total()
        {
            String Coupon = generateCoupon();
            System.out.println("Total Bill Amount ₹" +total);
            System.out.println("Your Coupon Code " + Coupon);
        }

}

class lunch extends food
{
    public String order;
    public int vmealsprice = 80;
    public int nvmealsprice = 100;
    public int cbriyaniprice = 120;
    public int mbriyaniprice = 240;
    public int cfriedriceprice = 110;
    public int efriedriceprice = 100;
    public int vfriedriceprice = 90;
    public int ebriyanidosaprice = 90;

    Scanner sc = new Scanner(System.in);

    public void order()
    {
         if(choice !=2)
		 {
			 System.out.println("Thanks for Choosing us...");
		 }
			 
			 System.out.println("Do you want to order Foods...");
				
			String order = sc.next();
		
		
		if(order.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the number of Veg Meals : ");
			int vmealsCount = sc.nextInt();
			System.out.println("Enter the number of Non-Veg Meals : ");
			int nvmealsCount = sc.nextInt();
			System.out.println("Enter the number of Chicken Briyani : ");
			int cbriyaniCount = sc.nextInt();
            System.out.println("Enter the number of Mutton Briyani : ");
			int mbriyaniCount = sc.nextInt();
			System.out.println("Enter the number of Chicken Fried Rice : ");
			int cfriedriceCount = sc.nextInt();
			System.out.println("Enter the number of Egg Fried Rice : ");
			int efriedriceCount = sc.nextInt();
            System.out.println("Enter the number of Veg Fried rice : ");
			int vfriedriceCount = sc.nextInt();
			System.out.println("Enter the number of Egg Briyani : ");
			int ebriyaniCount = sc.nextInt();
			
			int total = (vmealsCount*vmealsprice)+(nvmealsCount*nvmealsprice)+(cbriyaniCount*cbriyaniprice)+
                                    (mbriyaniCount*mbriyaniprice)+(cfriedriceCount*cfriedriceprice)+(efriedriceCount*efriedriceprice)+
                                    (vfriedriceCount*vfriedriceprice)+(ebriyaniCount*ebriyanidosaprice);
			
			System.out.println("Total Bill Amount ₹" +total);
		}
		else
		{
			System.out.println("Thanks for your Valuable time. you can Quit now....!!!!");
		}
    }

}
class dinner extends food
{
    public String order;
    public int vmealsprice = 80;
    public int nvmealsprice = 100;
    public int cbriyaniprice = 120;
    public int mbriyaniprice = 240;
    public int cfriedriceprice = 110;
    public int efriedriceprice = 100;
    public int vfriedriceprice = 90;
    public int ebriyanidosaprice = 90;

    Scanner sc = new Scanner(System.in);

     public void order()
    {
         if(choice !=3)
		 {
			 System.out.println("Thanks for Choosing us...");
		 }
			 
			 System.out.println("Do you want to order Foods...");
				
			String order = sc.next();
		
		
		if(order.equalsIgnoreCase("yes"))
		{
			System.out.println("Enter the number of Veg Meals : ");
			int vmealsCount = sc.nextInt();
			System.out.println("Enter the number of Non-Veg Meals : ");
			int nvmealsCount = sc.nextInt();
			System.out.println("Enter the number of Chicken Briyani : ");
			int cbriyaniCount = sc.nextInt();
            System.out.println("Enter the number of Mutton Briyani : ");
			int mbriyaniCount = sc.nextInt();
			System.out.println("Enter the number of Chicken Fried Rice : ");
			int cfriedriceCount = sc.nextInt();
			System.out.println("Enter the number of Egg Fried Rice : ");
			int efriedriceCount = sc.nextInt();
            System.out.println("Enter the number of Veg Fried rice : ");
			int vfriedriceCount = sc.nextInt();
			System.out.println("Enter the number of Egg Briyani : ");
			int ebriyaniCount = sc.nextInt();
			
			int  total = (vmealsCount*vmealsprice)+(nvmealsCount*nvmealsprice)+(cbriyaniCount*cbriyaniprice)+
                                    (mbriyaniCount*mbriyaniprice)+(cfriedriceCount*cfriedriceprice)+(efriedriceCount*efriedriceprice)+
                                    (vfriedriceCount*vfriedriceprice)+(ebriyaniCount*ebriyanidosaprice);
			
			System.out.println("Total Bill Amount ₹" +total);
		}
		else
		{
			System.out.println("Thanks for your Valuable time. you can Quit now....!!!!");
		}
    }

}




package sample;

import java.util.Random;

public class methodss 
{
    public static void main(String[] args) 
    {
        methodss.otpp();
    }

    public static void otp()
    {
        String num = "0123456789";
        int i;
        String otp = "";

        Random r = new Random();

        for(i=0; i<6; i++)
        {
            int rand = r.nextInt(num.length());
            otp = otp + num.charAt(rand);
        }

        System.out.println("Otp : " +otp);

    }

    public static void otpp()
    {
        String wrd = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        int i;
        String otp = "";

        Random r = new Random();

        for(i=0; i<6; i++)
        {
            int rand = r.nextInt(wrd.length());
            otp = otp + wrd.charAt(rand);
        }

        System.out.println("otp : " +otp);

    }  

}



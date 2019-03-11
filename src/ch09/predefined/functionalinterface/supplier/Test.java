/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09.predefined.functionalinterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

/**
 *
 * @author PC
 */
public class Test {
    private static void getDate()
    {
       Supplier<Date> s = () -> new Date();
       System.out.println("Date now is: " + s.get()); 
    }
    
    private static void getRandomName()
    {
        Supplier<String> s = () ->{
            String[] list = {"Sunny", "Bunny", "Chinny", "Vinny"};
            int x = (int) (Math.random() * 4);
            return list[x];
        };
        System.out.println("The random name is: " + s.get());
    }
    
    private static void getRandomOTP()
    {
        Supplier<String> s = () -> {
            String otp = "";
            for(int i = 0; i < 6; i++)
            {
                otp = otp + (int)(Math.random() * 10); //get 0 to 9 random number
            }
            return otp;
        };
        System.out.println("Random OTP: " + s.get());
    }
    
    public static void main(String[] args) 
    {
        getDate();
        getRandomName();
        getRandomOTP();
    }
}

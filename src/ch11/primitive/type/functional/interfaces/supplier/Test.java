/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.supplier;

import java.util.function.IntSupplier;

/**
 * IntSupplier, LongSupplier, DoubleSupplier, BooleanSupplier
 * @author PC
 */
public class Test {
    
    public static void getRandom()
    {
        IntSupplier s = ()-> (int)(Math.random() * 10);
        String otp = "";
        for(int i = 0; i < 6; i++)
        {
            otp = otp + s.getAsInt();
        }
        System.out.println("OTP es: " + otp);
    }
    
    public static void main(String[] args) {
        getRandom();
    }
}

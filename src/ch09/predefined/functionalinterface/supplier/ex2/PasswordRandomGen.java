/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch09.predefined.functionalinterface.supplier.ex2;

import java.util.function.Supplier;

/**
 *
 * @author PC
 */
public class PasswordRandomGen {
    /**
     * Requeriments: 
     * 1. longitud 8 caracteres
     * 2. las ubicaciones 2, 4, 6, 8 solo digitos
     * 3. 1, 3, 5, 7 solo alfabeto en mayusculas mas los caracteres @ # $
     */
    public static void getRandomPassword()
    {
        Supplier<String> s = ()->{
            String pwd = "";
            Supplier<Integer> d = () -> (int)(Math.random() * 10);
            String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$"; // 0-28 caracteres
            Supplier<Character> c = () -> symbols.charAt((int)(Math.random() * 29)); //get random between 0-28
            
            for(int i = 1; i <= 8; i++)
            {
                if(i % 2 == 0)
                {
                    pwd = pwd + d.get();
                }
                else
                {
                    pwd = pwd + c.get();
                }
            }
            
            return pwd;
        };
        System.out.println("The new password is: " + s.get());
    }
    
    public static void main(String[] args) {
        getRandomPassword();
    }
}

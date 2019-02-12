/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex2;

import java.util.Scanner;
import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class UserAuthTest {
    public static void main(String[] args) {
        Predicate<User> p = user -> user.getName().equals("Durga") && user.getPassword().equals("Java");
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese Usuario: ");
        String name = input.next();
        System.out.println("Ingrese password: ");
        String password = input.next();
        
        User user = new User();
        user.setName(name);
        user.setPassword(password);
        
        if(p.test(user)) // return true test
        {
            System.out.println("Usuario valido");
        }
        else
        {
            System.out.println("Usuario no valido");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex7;

import java.util.Scanner;
import java.util.function.Function;

/**
 * Programa de Demostracion para la Autenticacion de Uusario utilizando Function Chaining
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese User name: ");
        String user = input.next();
        
        System.out.println("Ingrese su Password: ");
        String pass = input.next();
        
        Function<String, String> f1 = s -> s.substring(0, 5);
        Function<String, String> f2 = s -> s.toLowerCase();
        if(f1.andThen(f2).apply(user).equals("durga") && pass.equals("java"))
        {
            System.out.println("Usuario valido");
        }
        else
        {
            System.out.println("Usuario invalido");
        }
    }
}

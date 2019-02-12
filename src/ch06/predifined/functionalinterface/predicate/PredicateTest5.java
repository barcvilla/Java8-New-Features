/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 * display names start with K
 * @author PC
 */
public class PredicateTest5 {
    public static void m1(Predicate<String> names, String[] x)
    {
        for(String x1 : x)
        {
            if(names.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
    
    public static void main(String[] args) {
        String[] names = {"Sunny", "Kajal", "Mallika", "Katina", "Kareena"};
        Predicate<String> p = s -> s.charAt(0) == 'K'; 
        System.out.println("Los nombres con K son: ");
        m1(p, names);
    }
}

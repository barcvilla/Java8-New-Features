/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 * Remove null, empty values
 * @author PC
 */
public class PredicateTest6 {
    public static void m1(Predicate<String> x, String[] values)
    {
        for(String value : values)
        {
            if(x.test(value))
            {
                System.out.println(value);
            }
        }
    }
    
    public static void main(String[] args) {
        String[] values = {"Durga", " ", null, "Ravi", " ", "", "Shina", null};
        Predicate<String> x = s -> s != null && s.length() != 0 && !s.equals(" ");
        System.out.println("Los valores que no son nulos y vacios son: ");
        m1(x, values);
    }
}

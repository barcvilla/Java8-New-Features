/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class PredicateTest4 {
    
    public static void m1(Predicate<Integer> p, int[] x)
    {
        for(int x1 : x)
        {
            if(p.test(x1))
            {
                System.out.println(x1);
            }
        }
    }
    
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30};
        
        Predicate<Integer> p1 = i -> i > 10;
        Predicate<Integer> p2 = i -> i % 2 == 0;
        System.out.println("Los numero mayores a 10 son: ");
        m1(p1, x);
        
        System.out.println("Los numero pares son: ");
        m1(p2, x);
        
        System.out.println("Los numeros no mayores que 10 son: ");
        m1(p1.negate(), x);
        
        System.out.println("Los numero mayores que 10 y pares son: ");
        m1(p1.and(p2), x);
        
        System.out.println("Los numero mayores que 10 o pares son: ");
        m1(p1.or(p2), x);
    }
}

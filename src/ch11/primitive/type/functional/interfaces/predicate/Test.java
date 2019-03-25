/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.predicate;

import java.util.function.IntPredicate;

/**
 * Predicate using int primitive (IntPredicate)
 * Predicate using double primitive (DoublePredicate)
 * Predicate using long primitive (LongPredicate)
 * @author PC
 */
public class Test {
    
    public static void intPar()
    {
        int[] x = {0, 5, 10, 15, 20, 25};
        IntPredicate p = i -> i % 2 == 0;
        for(int x1 : x)
        {
            if(p.test(x1))
            {
                System.out.println("El numero " + x1 + " es par");
            }
        }
    }
    
    public static void main(String[] args) {
        intPar();
    }
}

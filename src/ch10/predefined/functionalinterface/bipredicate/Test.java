/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bipredicate;

import java.util.function.BiPredicate;

/**
 * Functional Interface : Bi-Predicate
 * Bi-Predicate Function contiene dos argumentos:
 * interface BiPredicate<T t, U u> 
 * @author PC
 */
public class Test {
    
    public static boolean esPar()
    {
        BiPredicate<Integer, Integer> bi = (a, b) -> (a + b) % 2 == 0;
        return bi.test(10, 20);
    }
    
    public static void main(String[] args) 
    {
        System.out.println("El numero es par? " + esPar() );
    }
}

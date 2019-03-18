/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bifunction;

import java.util.function.BiFunction;

/**
 * Functional Interface : Bi-Function
 * BiFunction contiene 3 argumentos (dos inputs y un return)
 * interface BiFunction<T, U, R>
 * @author PC
 */
public class Test {
    
    public static Integer getProduct()
    {
        BiFunction<Integer, Integer, Integer> bi = (a, b) -> a * b;
        return bi.apply(5, 5);
    }
    
    public static void main(String[] args) {
        System.out.println("El producto es: " + getProduct());
    }
}

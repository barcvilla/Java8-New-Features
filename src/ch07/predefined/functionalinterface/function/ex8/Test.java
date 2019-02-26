/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex8;

import java.util.function.Function;

/**
 * Function Interface Static Method : Identity()
 * Function interface contains a static method
 * 
 * static <T> Function<T, T> identity()
 * Retorna una funcion que siempre  su argumento de entrada
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Function<String, String> f1 = Function.identity();
        String s2 = f1.apply("durga");
        System.out.println(s2);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex6;

import java.util.function.Function;

/**
 * Demostrar la diferencia entre andThen() y compose()
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Function<Integer, Integer> f1 = i -> i + i;
        Function<Integer, Integer> f2 = i -> i * i * i;
        
        System.out.println("Uso de f1.andThen(f2) " + f1.andThen(f2).apply(2)); // 4 * 4 *4 = 64
        System.out.println("Uso de f1.compose(f2) " + f1.compose(f2).apply(2)); // 8 + 8 = 16
    }
}

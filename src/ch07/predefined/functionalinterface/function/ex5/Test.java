/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex5;

import java.util.function.Function;

/**
 * Function Chaining: Unir dos o mas funciones
 * f1.andThen(f2) = f1 sera aplicado seguido de f2
 * f1.compose(f2) = f2 sera aplicado seguido de f1
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Function<String, String> f1 = s -> s.toUpperCase();
        Function<String, String> f2 = s -> s.substring(0,9); //obtenemos caracteres desde 0 a 9-1
        System.out.println("El resultado de f1 " + f1.apply("el Verbo era Dios"));
        System.out.println("El resultado de f2 " + f2.apply("el Verbo era Dios"));
        //chaining functions
        System.out.println("El resultado de f1.andThen(f2)" + f1.andThen(f2).apply("el Verbo era Dios"));
        System.out.println("El resultado de f1.compose(f2)" + f1.compose(f2).apply("el Verbo era Dios"));
    }
}

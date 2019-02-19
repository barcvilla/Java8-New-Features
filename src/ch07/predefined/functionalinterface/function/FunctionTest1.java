/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function;

import java.util.function.Function;

/**
 * Function: Es similar a Predicate, es decir, verifica una condicion pero esta no solo puede retornar true or false,
 * sino que puede retornar cualquier tipo de valor, ya sea primitivo u Object como Customer, Employee, etc
 * @author PC
 */
public class FunctionTest1 {
    public static void main(String[] args) {
        //Obtenemos la logitud de un texto
        Function<String, Integer> f = s -> s.length();
        System.out.println("La longitud es: " + f.apply("Java Code"));
        
        //Obtenemos la potencia de un numero
        Function<Integer, Integer> p = r -> r * r;
        System.out.println("Numero al cuadrado: " + p.apply(5));
        
        //Eliminamos los espacios en blanco
        Function<String, String> r = t -> t.replaceAll(" ", "");
        System.out.println("Texto sin espacion en blanco: " + r.apply("Hello Java World"));
        
        //
        Function<String, Integer> w = y -> y.length() - y.replaceAll(" ", "").length();
        System.out.println("Numero de espacios: " + w.apply("Hello Java World"));
    }
}

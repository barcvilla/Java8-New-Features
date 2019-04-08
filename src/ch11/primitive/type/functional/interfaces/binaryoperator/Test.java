/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.binaryoperator;

import java.util.function.BinaryOperator;

/**
 *
 * @author PC
 */
public class Test {
    
    public static void concatenate(String st1, String st2)
    {
        BinaryOperator<String> b = (s1, s2) -> s1 + " " + s2; 
        System.out.println("Concatenacion: " + b.apply(st1, st2));
    }
    
    public static void sumar(int num1, int num2)
    {
        BinaryOperator<Integer> b = (i1, i2) -> i1 + i2;
        System.out.println("La suma de " + num1 + " + " + num2 + " :" + b.apply(num1, num2));
    }
    
    public static void main(String[] args) {
        concatenate("Hello", "Java");
        sumar(5, 9);
    }
}

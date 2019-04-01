/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.unaryoperator;

import java.util.function.UnaryOperator;

/**
 *
 * @author PC
 */
public class Test {
    
    public static void workingUnaryOperator(int num)
    {
        UnaryOperator<Integer> o = i-> i * i;
        System.out.println("Potencia de " + num + " es: " + o.apply(num));
    }
    
    public static void main(String[] args) {
        workingUnaryOperator(8);
    }
}

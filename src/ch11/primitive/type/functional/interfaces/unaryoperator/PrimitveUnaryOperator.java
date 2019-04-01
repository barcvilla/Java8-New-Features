/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.unaryoperator;

import java.util.function.IntUnaryOperator;

/**
 * Primite Unary Operator evita realizar AutoUnBoxing y AutoBoxing que realiza la interface UnaryOperator
 * Tambien existen LongUnaryOperator, DoubleUnaryOperator
 * @author PC
 */
public class PrimitveUnaryOperator {
    
    public static void workingPrimitiveUnaryOperator(int num)
    {
        IntUnaryOperator o = i -> i * i;
        System.out.println("La potencia de " + num + " es " + o.applyAsInt(num));
    }
    
    public static void main(String[] args) {
        workingPrimitiveUnaryOperator(10);
    }
}

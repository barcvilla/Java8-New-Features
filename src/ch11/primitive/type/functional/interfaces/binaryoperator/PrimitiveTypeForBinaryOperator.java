/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.binaryoperator;

import java.util.function.IntBinaryOperator;

/**
 * Los Primitive Binary Operator son: IntinaryOprator, DoubleBinaryOperator, LongBinaryOperator
 * @author PC
 */
public class PrimitiveTypeForBinaryOperator {
    
    public static void sumar(int num1, int num2)
    {
        IntBinaryOperator b = (i1, i2) -> i1 + i2;
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + b.applyAsInt(num1, num2) );
    }
    
    public static void main(String[] args) {
        sumar(15, 20);
    }
}

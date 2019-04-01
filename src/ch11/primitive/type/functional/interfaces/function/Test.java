/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.function;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

/**
 *
 * @author PC
 */
public class Test {
    
    public static void getSqrt()
    {
        int root = 81;
        IntToDoubleFunction f = i -> Math.sqrt(i);
        System.out.println("La raiz cuadrada de " + root + " es " + f.applyAsDouble(root));
    }
    
    public static void getLength()
    {
        // solo especifico el input y la funcion retorna un valor int
        ToIntFunction<String> f = i -> i.length();
        String t = "Durga";
        System.out.println("La logitud de " + t + " es " + f.applyAsInt(t));
    }
    
    public static void test()
    {
       IntFunction<Integer> f = i -> i * i;
       System.out.println(f.apply(5)); 
    }
    
    public static void main(String[] args) {
        test();
        getLength();
        getSqrt();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.biconsumer;

import java.util.function.BiConsumer;

/**
 *
 * @author PC
 */
public class Test {
    
    public static void print(String v1, String v2)
    {
        BiConsumer<String, String> bic = (s1, s2) -> System.out.println("Print is: " + s1 + " " + s2);
        bic.accept(v1, v2);
    }
    
    public static void main(String[] args) {
        print("hello", "world!");
    }
}

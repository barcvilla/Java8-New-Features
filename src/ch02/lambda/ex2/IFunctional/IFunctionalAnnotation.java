/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.IFunctional;

/**
 * Podemos indicar que una interface es funcional mediante la anotacion @FunctionalInterface
 * @author PC
 */
@FunctionalInterface
public interface IFunctionalAnnotation {
    public abstract void m1();
    
    default void m2(){}
    
    public static void m3(){}
}

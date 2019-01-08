/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.IFunctional;

/**
 * Functional Interface. - Son utilizadas para invocar o llamar lambda expresions
 * Esta se trata de una interface funcional ya que solo contiene un metodo abstrac m1()
 * Ejemplos de Functional Interface son: Runnable, Callable, ActionListemer
 * @author PC
 */
public interface IFunctional {
    public abstract void m1();
    //Una interface functional puede contener muchos default metodos
    default void m2(){}
    // Una interface functional puede contener muchos metodos static
    public static void m3(){}
}

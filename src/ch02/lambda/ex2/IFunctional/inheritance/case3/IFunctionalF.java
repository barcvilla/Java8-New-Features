/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.IFunctional.inheritance.case3;

/**
 * La interface hija no es una interface funcional, ya que esta hereda el metodo abstracto m1() de la interface padre
 * y se define un segundo metodo abstracto m2()
 * @author PC
 */
public interface IFunctionalF extends IFunctionalE {
    public abstract void m2();
}

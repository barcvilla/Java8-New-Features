/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.IFunctional.inheritance.case2;

/**
 * En una interface funcional hija podemos definir el nombre exacto del metodo abstracto en la interface padre.
 * En una interface hija no podemos definir ningun metodo abstracto nuevo, eso produciria un error de compilacion
 * @author PC
 */
@FunctionalInterface
public interface IFunctionalD extends IFunctionalC {
    public abstract void m1();
}

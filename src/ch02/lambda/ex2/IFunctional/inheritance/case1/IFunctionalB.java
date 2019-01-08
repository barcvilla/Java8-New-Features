/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.IFunctional.inheritance.case1;

/**
 * Caso 1: Functional Interface B extiende de la IFunctionalA. Esta interface hija no contiene ningun metodo abstracto
 * asi que la interface hija siempre es una functional interface
 * @author PC
 */
@FunctionalInterface
public interface IFunctionalB extends IFunctionalA{
    
}

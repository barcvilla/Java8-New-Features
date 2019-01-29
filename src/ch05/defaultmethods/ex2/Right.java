/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.defaultmethods.ex2;

/**
 *
 * @author PC
 */
public interface Right {
    default void m1()
    {
        System.out.println("Right default method");
    }
}

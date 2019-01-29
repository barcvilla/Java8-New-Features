/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch05.defaultmethods.ex1;

/**
 *
 * @author PC
 */
public interface Interf 
{
    default void m1()
    {
        System.out.println("Interface default method...");
    }
}

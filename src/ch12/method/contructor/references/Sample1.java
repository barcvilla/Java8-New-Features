/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12.method.contructor.references;

/**
 *
 * @author PC
 */

interface interf
{
    public void m1();
}


public class Sample1 
{
    public static void m2()
    {
        System.out.println("Implementation by Method Reference");
    }
    
    public static void main(String[] args) {
        interf i = Sample1::m2; // para static method utilizamos la clase :: nombre del metodo
        i.m1();
    }
}

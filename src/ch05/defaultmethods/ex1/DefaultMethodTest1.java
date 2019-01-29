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
public class DefaultMethodTest1 implements Interf
{
    @Override
    public void m1()
    {
        System.out.println("my own default implementation");
    }
    
    public static void main(String[] args) {
        DefaultMethodTest1 df = new DefaultMethodTest1();
        df.m1();
    }
}

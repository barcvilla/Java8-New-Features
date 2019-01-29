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
public class Test implements Left, Right{
    @Override
    public void m1()
    {
        //System.out.println("My own Implementation");
        Left.super.m1();
    }
    
    public static void main(String[] args) {
        Test t = new Test();
        t.m1();
    }
}

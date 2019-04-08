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
public class TestConstructorReferences {
    
    public static void constructorReferences()
    {
        Interf i = Sample3::new; // get method impl
        Sample3 s = i.get();
    }
    
    public static void lambdaConstructorReferences()
    {
        Interf i = () -> 
        {
            Sample3 s = new Sample3();
            return s;
        };
        Sample3 s1 = i.get();
    }
    
    public static void main(String[] args) {
        constructorReferences();
        //lambdaConstructorReferences();
    }
}

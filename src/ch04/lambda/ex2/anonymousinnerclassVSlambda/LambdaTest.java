/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04.lambda.ex2.anonymousinnerclassVSlambda;

/**
 *
 * @author PC
 */
public class LambdaTest {
    int x = 888;
    
    public void m2()
    {
        // Lambda expresion
        Interf i = ()-> {
            /**
             * dentro de un lambda expresion no se puede declarar una variable de instancia, solo variable local.
             * mediante this se accede a los miembros de clase outer y no a las variables de lambda expresion
             */
            int x = 999;
            System.out.println(this.x);
        };
        i.m1();
    }
    
    public static void main(String[] args) {
        LambdaTest l = new LambdaTest();
        l.m2();
    }
}

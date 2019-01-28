/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04.lambda.ex2.anonymousinnerclassVSlambda;

/**
 * El uso del keyword this en una inner class anonima es distinto en un Lambda.
 * Dentro de una inner class anonima se puede declarar variables de instancia
 * @author PC
 */
public class InnerClassTest {
    
    int x = 888; // esta clase outer contiene la variable de instancia x
    
    public void m2()
    {
        // inner class anonima
        Interf i = new Interf() 
        {
            int x = 999; // declaramos una variable de instancia x en la inner class anonima
            @Override
            public void m1() {
                // mediante this accedemos a los miembros de la clase inner anonima
                System.out.println(this.x); // hacemos referencia a la variable de instancia x de la inner class anonima
            }
        };
        i.m1();
    }
    
    public static void main(String[] args) {
        InnerClassTest t = new InnerClassTest();
        t.m2();
    }
}

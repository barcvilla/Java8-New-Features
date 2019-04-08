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
public class Sample2 {
    
    // working thread using method references
    public void m1()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Child Thread");
        }
    }
    
    public static void runThreadMethodReferences()
    {
        Sample2 s1 = new Sample2();
        Runnable r = s1::m1; // para non-static method instanciamos un objeto y llamamos al metodo
        Thread t1 = new Thread(r);
        t1.start();
    }
    
    //working thread using lambda expression
    public static void runLambdaImpl()
    {
       Runnable r = () -> 
        {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Child Threah");
            }
        };
       
       Thread t = new Thread(r);
       t.start();
    }
    
    public static void mainThread()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println("Main thread");
        }
    }
    
    public static void main(String[] args) {
        //runLambdaImpl();
        runThreadMethodReferences();
        mainThread();
    }
}

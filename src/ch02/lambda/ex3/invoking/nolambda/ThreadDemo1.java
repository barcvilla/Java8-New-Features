/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex3.invoking.nolambda;

/**
 * Generamos 2 Thread, uno el main y el otro producido por myRunnable
 * @author PC
 */
public class ThreadDemo1 {
    public static void main(String[] args) {
        
        Runnable rn = new myRunnable();
        Thread th = new Thread(rn);
        th.start();
        for(int i = 0; i < 10; i++)
        {
            System.out.println("main Thread");
        }
    }
}

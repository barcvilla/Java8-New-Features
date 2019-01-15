/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex3.invoking.lambda;

/**
 *
 * @author PC
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        Runnable rn = () -> {
            for(int i = 0; i < 10; i++)
            {
                System.out.println("lambda: child thread");
            }
        };
        Thread nt = new Thread(rn);
        nt.start();
        for(int i = 0; i < 10; i++)
        {
            System.out.println("lambda: main thread");
        }
    }
}

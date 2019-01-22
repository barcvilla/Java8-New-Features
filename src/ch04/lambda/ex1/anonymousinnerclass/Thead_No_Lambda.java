/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch04.lambda.ex1.anonymousinnerclass;

/**
 *
 * @author PC
 */
public class Thead_No_Lambda {
    public static void main(String[] args) {
        Runnable run = new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 4; i++)
                {
                    System.out.println("Child Thread ");
                }
            }
        };
        
        Thread th = new Thread(run);
        th.start();
        
        for(int i = 0; i < 4; i++)
        {
            System.out.println("Main Thread");
        }
    }
}

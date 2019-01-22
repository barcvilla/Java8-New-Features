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
public class Thread_With_Lambda 
{
    public static void main(String[] args) {
        Runnable run = () ->{
            for(int i = 0; i < 10; i++)
            {
                System.out.println("Child thread");
            }
        };
        
        Thread th = new Thread(run);
        th.start();
        
        for(int i = 0; i < 10; i++)
        {
            System.out.println("main child");
        }
    }
}

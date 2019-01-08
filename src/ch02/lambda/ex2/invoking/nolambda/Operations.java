/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.invoking.nolambda;

/**
 *
 * @author PC
 */
public class Operations implements MathOpe{
    @Override
    public void add(int a, int b)
    {
        System.out.println("La suma es: " + (a + b));
    }
}

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
public class Test {
    public static void main(String[] args) {
        MathOpe i = new Operations();
        i.add(10, 10);
        i.add(100, 100);
    }
}

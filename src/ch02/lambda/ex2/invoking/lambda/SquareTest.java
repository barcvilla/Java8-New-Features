/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex2.invoking.lambda;

/**
 *
 * @author PC
 */
public class SquareTest {
    public static void main(String[] args) {
        ISquare i = (a) -> a * a;
        System.out.println("La potencia de 5 es: " + i.getSquare(5));
    }
}

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
public class TestSquare {
    public static void main(String[] args) {
        ISquare i = new SquareImpl();
        System.out.println("El cuadrado de 5 es: " + i.getSquare(5));
    }
}

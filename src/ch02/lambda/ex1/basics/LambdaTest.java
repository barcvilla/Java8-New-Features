/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex1.basics;

/**
 *
 * @author PC
 */
public class LambdaTest 
{
    public static void suma()
    {
        /**
         * Los lambda con multiples parametros se separan con una coma (,)
         * Mediante el type inference el compilador puede reconocer el tipo de datos del parametro
         */
        MathOperations addope = (a, b) -> System.out.println("La suma es: " + (a + b));
        addope.add(5, 5);
    }
    
    public static void printLength(String msg)
    {
        /**
         * Si en el lambda hay un solo parametro, lo parentesis son opcionales.
         * Si la expresion lambda contiene una sola linea las llaves son opcionales.
         * Si la expresion Lambda retrna un valor, return keyword puede ser omitido
         */
        StringOperations str = text -> text.length();
        System.out.println(str.getLength(msg));
    }
    
    public static void main(String[] args) {
        suma();
        printLength("hello");
    }
}

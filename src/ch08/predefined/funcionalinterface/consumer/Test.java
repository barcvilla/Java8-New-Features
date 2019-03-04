/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08.predefined.funcionalinterface.consumer;

import java.util.function.Consumer;

/**
 * Consumer acepta un valor y lo procesa.
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Consumer<String> c = s -> System.out.println(s);
        
        c.accept("Hello");
        c.accept("Hello World");
    }
}

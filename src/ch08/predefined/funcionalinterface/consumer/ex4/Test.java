/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08.predefined.funcionalinterface.consumer.ex4;

import java.util.function.Consumer;

/**
 * Consumer chaining: c1.andThen(c2).andThen(c3).accept(m);
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Consumer<Movie> c1 = m -> {System.out.println("movie: " + m.getName() + " is ready to release");};
        Consumer<Movie> c2 = m -> {System.out.println("movie " + m.getName() + " is " + m.getResult());};
        Consumer<Movie> c3 = m -> System.out.println("Movie " + m.getName() + " information stored into Database");
        
        Consumer<Movie> chainingC = c1.andThen(c2).andThen(c3);
        
        Movie m = new Movie("The Pianist", "hit");
        chainingC.accept(m);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08.predefined.funcionalinterface.consumer.ex2;

import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * Display Object information using Consumer
 * @author PC
 */
public class Test {
    
    private static void populate(ArrayList<Movie> movies)
    {
        movies.add(new Movie("The Pianist", "Spilmann", "Dorota"));
        movies.add(new Movie("Rocky I", "Stallone", "Shire"));
        movies.add(new Movie("Predator", "Arnold S.", "C. Weathers"));
    }
    
    public static void main(String[] args) {
        ArrayList<Movie> movies = new ArrayList<Movie>();
        populate(movies);
        
        Consumer<Movie> c = m -> {
            System.out.println("Movie name: " + m.getName());
            System.out.println("Movie hero: " + m.getHero());
            System.out.println("Movie heroine: " + m.getHeroine());
        };
        
        for(Movie m : movies)
        {
            c.accept(m);
        }
    }
}

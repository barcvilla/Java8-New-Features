/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13.streams.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Filtering Stream: Si queremos filtrar elementos de una coleccion basados en una condicion booleana debemos usar filter()
 * de la interface stream
 * Mapping Stream: Si queremos crear un nuevo objeto separado para cada objeto presente en la coleccion basados en una funcion
 * entonces debemos utilizar map() de la interface stream
 * @author PC
 */
public class Test {
    private static ArrayList<String> l = new ArrayList<>();
    
    private static void populate()
    {
        l.add("Pavon"); 
        l.add("Fernando Prado"); 
        l.add("Antonio"); 
        l.add("Mariana");
    }
    
    private static void streamsUsingFilter()
    {
        
        List<String> l1 = l.stream().filter(n -> n.length() >= 9).collect(Collectors.toList());
        System.out.println("Stream usando filter() " + l1);
    }
    
    private static void streamsUsingMap()
    {
        
        List<String> l2 = l.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Stream usando map(): " + l2);
    }
    
    private static void streamCount()
    {
        long count = l.stream().count();
        System.out.println("Count elements: " + count);
    }
    
    private static void streamCountFilter()
    {
        long count = l.stream().filter(n -> n.length() <= 9).count();
        System.out.println("Filter stream count: " + count);
    }
    
    public static void main(String[] args) {
        populate();
        streamsUsingFilter();
        streamsUsingMap();
        streamCount();
        streamCountFilter();
    }
}

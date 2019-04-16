/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Filtering Stream: Si queremos filtrar elementos de una coleccion basados en una condicion booleana debemos usar filter()
 * de la interface stream
 * Mapping Stream: Si queremos crear un nuevo objeto separado para cada objeto presente en la coleccion basados en una funcion
 * entonces debemos utilizar map() de la interface stream
 * @author PC
 */
public class Test {
    
    private static ArrayList<Integer> l = new ArrayList<Integer>();
    
    private static void populate()
    {
        l.add(0); l.add(5); l.add(10); l.add(15); l.add(20); l.add(25);
    }
    
    private static void processCollectionWithOutStreams()
    {
        populate();
        List<Integer> l1 = new ArrayList<Integer>();
        for(Integer i1 : l)
        {
            if(i1 % 2 == 0)
            {
                l1.add(i1);
            }
        }
        System.out.println("Collection without streams" + l1);
    }
    
    private static void mappingCollectionStream()
    {
        List<Integer> l3 = l.stream().map(i -> i * 2).collect(Collectors.toList());
        System.out.println("Stream Map Collection: " + l3);
    }
    
    private static void processCollectionWithStreams()
    {
        List<Integer> l2 = l.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println("Collection using streams: " + l2);
    }
    
    public static void main(String[] args) {
        processCollectionWithOutStreams();
        processCollectionWithStreams();
        mappingCollectionStream();
    }
}

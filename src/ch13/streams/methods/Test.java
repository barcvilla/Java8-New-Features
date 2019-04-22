/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch13.streams.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Filtering Stream: Si queremos filtrar elementos de una coleccion basados en una condicion booleana debemos usar filter()
 * de la interface stream
 * Mapping Stream: Si queremos crear un nuevo objeto separado para cada objeto presente en la coleccion basados en una funcion
 * entonces debemos utilizar map() de la interface stream
 * @author PC
 */
public class Test {
    private static ArrayList<String> names = new ArrayList<>();
    private static ArrayList<Integer> numbers = new ArrayList<>();
    private static ArrayList<String> letras = new ArrayList<>();
    
    private static void populateNames()
    {
        names.add("Pavon"); 
        names.add("Fernando Prado"); 
        names.add("Antonio"); 
        names.add("Mariana");
    }
    
    private static void populateNumbers()
    {
        numbers.add(0);
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
    }
    
    public static void populateLetters()
    {
        letras.add("A");
        letras.add("BB");
        letras.add("CCC");
    }
    
    private static void streamsUsingFilter()
    {
        
        List<String> l1 = names.stream().filter(n -> n.length() >= 9).collect(Collectors.toList());
        System.out.println("Stream usando filter() " + l1);
    }
    
    private static void streamsUsingMap()
    {
        
        List<String> l2 = names.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("Stream usando map(): " + l2);
    }
    
    private static void streamCount()
    {
        long count = names.stream().count();
        System.out.println("Count elements: " + count);
    }
    
    private static void streamCountFilter()
    {
        long count = names.stream().filter(n -> n.length() <= 9).count();
        System.out.println("Filter stream count: " + count);
    }
    
    /**
     * sorted() es utilizado para ordenar los elementos dentro de un stream
     * podemos realizar ordenamiento basado en un orden natural
     * podemos realizar un ordenamiento basado en un orden personalizado especificado por el objeto Comparator
     */
    public static void streamDefaultMethodSorted()
    {
        List<Integer> l3 = numbers.stream().sorted().collect(Collectors.toList());
        System.out.println("Default sorted stream: " + l3);
    }
    
    public static void streamComparatorMethodSorted()
    {
        // el signo (-) significa ordenamiento descendente. Tambien es posible colocar i2.compareTo(i1) se obtiene el mismo resultado
        List<Integer> l4 = numbers.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Comparator sorted stream: " + l4);
    }
    
    public static void streamMixValue()
    {
        Integer min = numbers.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("min value in: " + numbers + " is: " + min);
    }
    
    public static void streamMaxValue()
    {
        Integer max = numbers.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println("max value in " + numbers + " is: " + max);
    }
    
    /**
     * Procesamiento forEach() method
     * Este metodo no retorna nada
     * Este metodo puede tomar lambda expression como argumento y aplicar ese lambda expression para cada elemento
     * presente en el stream
     */
    public static void streamForEachMethod()
    {
        //letras.stream().forEach(s -> System.out.println(s));
        letras.stream().forEach(System.out::println);
    }
    
    /**
     * Procesamiento toArray()
     * Podemos usar el metodo toArray() para copiar elementos presentes en el stream en un array especificado
     */
    public static void streamToArrayMethod()
    {
        Integer[] array = numbers.stream().toArray(Integer[]::new);
        for(Integer i : array)
        {
            System.out.println(i);
        }
    }
    
    /**
     * Stream.of() method
     * Podemos tambien aplicar Stream para grupo de valores y para Arrays
     */
    public static void streamOfMethod()
    {
        Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
        s.forEach(System.out::println);
        
        Double[] d = {10.0, 10.1, 10.2, 10.3, 10.4};
        Stream<Double> s1 = Stream.of(d);
        s1.forEach(System.out::println);
    }
    
    public static void main(String[] args) {
        populateNames();
        populateNumbers();
        populateLetters();
        streamsUsingFilter();
        streamsUsingMap();
        streamCount();
        streamCountFilter();
        streamDefaultMethodSorted();
        streamComparatorMethodSorted();
        streamMixValue();
        streamMaxValue();
        streamForEachMethod();
        streamToArrayMethod();
        streamOfMethod();
        streamOfMethod();
    }
}

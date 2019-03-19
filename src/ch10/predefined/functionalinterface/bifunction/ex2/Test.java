/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bifunction.ex2;

import java.util.ArrayList;
import java.util.function.BiFunction;

/**
 *
 * @author PC
 */
public class Test {
    
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        BiFunction<String, Integer, Student> bi = (name, rollNo) -> new Student(name, rollNo);
        l.add(bi.apply("Juan", 1));
        l.add(bi.apply("Manuel", 2));
        l.add(bi.apply("Fernando", 3));
        
        for(Student s : l)
        {
            System.out.println(s);
        }
    }
}

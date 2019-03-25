/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.biconsumer.ex2;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

/**
 * Program to increment employee salary by using BiConsumer
 * @author PC
 */
public class Test {
    
    public static void main(String[] args) 
    {
        ArrayList<Employee> l = new ArrayList<Employee>();
        BiFunction<String, Double, Employee> bf = (name, salary) -> new Employee(name, salary);
        l.add(bf.apply("Durga", 1000.00));
        l.add(bf.apply("Sunny", 2000.00));
        l.add(bf.apply("Chinny", 3000.00));
        
        //realizamos el incremento de salario
        BiConsumer<Employee, Double> b = (e, increment) -> e.setSalary(e.getSalary() + increment);
        l.forEach((e) -> {
            b.accept(e, 500.00);
        });
        
        l.forEach((e) -> System.out.println(e));
        
    }
}

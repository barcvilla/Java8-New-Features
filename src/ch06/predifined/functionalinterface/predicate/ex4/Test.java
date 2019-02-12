/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex4;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee();
        
        e1.setName("Carlos Villanueva");
        e1.setDesignation("Developer");
        e1.setSalary(15000);
        e1.setCity("Buenos Aires");
        
        Employee e2 = new Employee("Sunny", "Manager", 20000, "BSAS");
        
        list.add(e1);
        list.add(e2);
        
        System.out.println(list);
    }
}

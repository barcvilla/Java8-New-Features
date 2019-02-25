/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex4;

import ch06.predifined.functionalinterface.predicate.ex4.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Perform Salary increment
 * @author PC
 */
public class Test {
    public static void populate(List<Employee> list)
    {
        Employee e1 = new Employee("Carlos Villanueva", "Software developer", 22000, "BSAS"); 
        Employee e2 = new Employee("Sunny", "Manager", 2000, "BSAS");
        Employee e3 = new Employee("Fernando", "Manager", 35000, "MZ");
        Employee e4 = new Employee("Mariana", "Manager", 3000, "BSAS");
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
    
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);
        Predicate<Employee> p = e -> e.getSalary() < 3500;
        Function<Employee, Employee> f = e -> 
        {
            e.setSalary(e.getSalary() + 477);
            return e;
        };
        
        ArrayList<Employee> list2 = new ArrayList<Employee>();
        for(Employee e : list)
        {
            // evaluamos los empleados que cumplan con el predicado: salary < 3500
            if(p.test(e))
            {
                f.apply(e);
                list2.add(e);
            }
            
        }
        
        System.out.println("Before salary increment: " + list);
        System.out.println("After salary increment: " + list2);
    }
}

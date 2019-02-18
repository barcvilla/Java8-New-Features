/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex6;

import ch06.predifined.functionalinterface.predicate.ex4.Employee;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Usando Predicate aplicamos multiples filtros a una lista utilizando join
 * @author PC
 */
public class Test {
    public static void display(Predicate<Employee> p1, ArrayList<Employee> list)
    {
        for(Employee e : list)
        {
            if(p1.test(e))
            {
                System.out.println(e);
            }
        }
    }
    
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        Employee e1 = new Employee();
        
        e1.setName("Carlos Villanueva");
        e1.setDesignation("Developer");
        e1.setSalary(15000);
        e1.setCity("Buenos Aires");
        
        Employee e2 = new Employee("Sunny", "Manager", 20000, "BSAS");
        Employee e3 = new Employee("Fernando", "Manager", 35000, "MZ");
        Employee e4 = new Employee("Mariana", "Manager", 33000, "BSAS");
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        
        Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
        Predicate<Employee> p2 = emp -> emp.getCity().equals("BSAS");
        System.out.println("Manager Employees from BSAS");
        display(p1.and(p2), list);
        
        System.out.println();
        //Listamos los empleados que NO SON MANAGERS
        System.out.println("Not Managers Employee");
        display(p1.negate(), list);
    }
}

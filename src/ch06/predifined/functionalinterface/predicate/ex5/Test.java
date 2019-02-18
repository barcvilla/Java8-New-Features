/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex5;

import ch06.predifined.functionalinterface.predicate.ex4.Employee;
import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * Utilizando Predicate y la propiedad getDesignation de la clase Employee aplicamos filtros a la lista de datos. En este ejemplo
 * filtramos todos los empleados cuyo designation es igual a Manager
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
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        
        Predicate<Employee> p1 = emp -> emp.getDesignation().equals("Manager");
        System.out.println("Manager Employees");
        display(p1, list);
        
        System.out.println();
        Predicate<Employee> p2 = emp -> emp.getSalary()<25000;
        System.out.println("Employees with salary less than 25000");
        display(p2, list);
        
    }
}

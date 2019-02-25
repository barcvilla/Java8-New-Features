/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex3;

import ch06.predifined.functionalinterface.predicate.ex4.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Function para obtener El salario total mensual de todos los empleados
 * @author PC
 */
public class Test {
    
    public static void populate(List<Employee> list)
    {
        Employee e1 = new Employee("Carlos Villanueva", "Software developer", 22000, "BSAS"); 
        Employee e2 = new Employee("Sunny", "Manager", 20000, "BSAS");
        Employee e3 = new Employee("Fernando", "Manager", 35000, "MZ");
        Employee e4 = new Employee("Mariana", "Manager", 33000, "BSAS");
        
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
    }
    
    public static void display(ArrayList<Employee> list)
    {
        for(Employee e : list)
        {
            System.out.print(" " + e.getName() + " " + e.getSalary());
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<Employee>();
        populate(list);
        Function<ArrayList<Employee>, Double> f = empList ->
        {
            double total = 0;
            for(Employee e : list)
            {
                total = total + e.getSalary();
            }
            return total;
        };
        display(list);
        System.out.println("El total de los salarios de todos los empleados: " + f.apply(list));
    }
}

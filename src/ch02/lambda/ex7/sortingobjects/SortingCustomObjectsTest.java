/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex7.sortingobjects;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class SortingCustomObjectsTest {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList();
        employees.add(new Employee(100, "Durga"));
        employees.add(new Employee(400, "Juan"));
        employees.add(new Employee(300, "Mario"));
        employees.add(new Employee(200, "Alan"));
        
        System.out.println("Print array before sorting: " + employees);
        
        Collections.sort(employees, (e1, e2)-> (e1.id > e2.id) ? -1 : (e1.id < e2.id) ? 1 : 0);
        System.out.println("Print array after custom sorting (descendente): " + employees );
        
        Collections.sort(employees, (e1, e2)-> (e1.id < e2.id) ? -1 : (e1.id > e2.id) ? 1 : 0);
        System.out.println("Print array after custom sorting (ascendente): " + employees );
    }
}

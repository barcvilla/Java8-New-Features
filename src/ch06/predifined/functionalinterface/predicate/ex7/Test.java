/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex7;

import ch06.predifined.functionalinterface.predicate.ex4.Employee;
import java.util.function.Predicate;

/**
 * Predicate interface isEquals()
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Predicate<String> p = Predicate.isEqual("Java");
        System.out.println(p.test("C#"));
        System.out.println(p.test("Java"));
        
        System.out.println();
        Predicate<Employee> isCeo = Predicate.isEqual(new Employee("Carlos", "CEO", 12000, "BSAS"));
        Employee e1 = new Employee("Carlos", "CEO", 12000, "BSAS");
        System.out.println(isCeo.test(e1));
    }
}

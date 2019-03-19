/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bifunction.ex3;

import java.util.function.BiFunction;

/**
 * Calculo salario mensual con objetos Employee y TimeSheet como inputs usando BiFunction
 * @author PC
 */
public class Test {
    public static void main(String[] args) {
        Employee e = new Employee(101, "Durga", 1500);
        TimeSheet t = new TimeSheet(101, 25);
        
        BiFunction<Employee, TimeSheet, Double> bi = (em, ti) -> e.getDailyWage() * t.getDays();
        System.out.println("Monthly Salary: " + bi.apply(e, t));
    }
}

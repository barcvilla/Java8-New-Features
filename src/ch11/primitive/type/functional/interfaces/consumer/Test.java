/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch11.primitive.type.functional.interfaces.consumer;

import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

/**
 * Con este tipo primitivo de Consumer se evita procesamientos internos como autoboxing el cual afecta el rendimiento de la app
 * Los tipos de Primitive type Consumer son: 
 * IntConsumer: accept(int i), 
 * LongConsumer: accept(long l), 
 * DoubleConsumer: accept(double d)
 * @author PC
 */
public class Test {
    
    public static void incrementSalary()
    {
        ObjDoubleConsumer<Employee> c = (e,d) -> e.setSalary(e.getSalary() + d);
        Employee e = new Employee("Durga", 1000);
        System.out.println("Empleado con su actual salario: " + e.getName() + " " + e.getSalary());
        c.accept(e, 500);
        System.out.println("Empleado con actual salario: " + e.getName() + " " + e.getSalary());
    }
    
    public static void consumerInt(int num)
    {
        IntConsumer c = i -> System.out.println("El numero es: " + i);
        c.accept(num);
    }
    
    public static void main(String[] args) {
        consumerInt(5);
        incrementSalary();
    }
}

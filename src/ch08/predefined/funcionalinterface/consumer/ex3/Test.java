/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08.predefined.funcionalinterface.consumer.ex3;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class Test {
    
    private static void populate(ArrayList<Student> students)
    {
        students.add(new Student("Fernando", 50));
        students.add(new Student("Gonzalo", 60));
        students.add(new Student("Mariano", 55));
        students.add(new Student("Juan", 75));
        students.add(new Student("Antonio", 80));
    }
    
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();
        populate(students);
        
        Predicate<Student> p = s -> s.getMarks() >= 60;
        
        Function<Student, String> f = s -> {
            int marks = s.getMarks();
            if(marks >= 80)
            {
                return "A[Dictinction]";
            }
            else if(marks >= 60)
            {
                return "B[First Class]";
            }
            else if(marks >= 50)
            {
                return "C[Second Class]";
            }
            else if(marks >= 35)
            {
                return "D[Third Class]";
            }
            else
            {
                return "E[Failed]";
            }
        };
        
        Consumer<Student> c = s -> {
            System.out.println("Student name: " + s.getName());
            System.out.println("Student mark: " + s.getMarks());
            System.out.println("Student grade: " + f.apply(s));
            System.out.println();
        };
        
        for(Student s : students)
        {
            if(p.test(s))
            {
                c.accept(s);
            }
        }
    }
}

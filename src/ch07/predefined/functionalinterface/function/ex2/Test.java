/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex2;

import java.util.ArrayList;
import java.util.function.Function;

/**
 *
 * @author PC
 */
public class Test 
{
    public static void populate(ArrayList<Student> l)
    {
        l.add(new Student("Sunny", 100));
        l.add(new Student("Bunny", 65));
        l.add(new Student("Chinny", 55));
        l.add(new Student("Vinny", 45));
        l.add(new Student("Pinny", 25));
    }
    
    public static void main(String[] args) {
        ArrayList<Student> l = new ArrayList<Student>();
        populate(l);
        Function<Student, String> f = s ->
        {
            int marks = s.getMarks();
            if(marks >= 80)
            {
                return "A[Dictintion]";
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
    }
}

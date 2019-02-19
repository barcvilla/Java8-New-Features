/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch07.predefined.functionalinterface.function.ex2;

/**
 *
 * @author PC
 */
public class Student {
    private String name;
    private int marks;
    
    public Student(String name, int marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }
    
    
}

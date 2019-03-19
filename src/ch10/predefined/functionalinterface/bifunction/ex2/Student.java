/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bifunction.ex2;

/**
 *
 * @author PC
 */
public class Student {
    private String name;
    int rollNo;
    
    public Student(String name, int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", rollNo=" + rollNo + '}';
    }
    
    
}

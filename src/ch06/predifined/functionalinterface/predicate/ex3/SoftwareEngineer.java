/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex3;

/**
 *
 * @author PC
 */
public class SoftwareEngineer {
    private String name;
    private int age;
    private boolean isHavingGF;
    
    public SoftwareEngineer(){}
    
    public SoftwareEngineer(String name, int age, boolean isHavingGF)
    {
        this.name = name;
        this.age = age;
        this.isHavingGF = isHavingGF;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isIsHavingGF() {
        return isHavingGF;
    }

    public void setIsHavingGF(boolean isHavingGF) {
        this.isHavingGF = isHavingGF;
    }

    @Override
    public String toString() {
        return "SoftwareEngineer{" + "name=" + name + ", age=" + age + ", isHavingGF=" + isHavingGF + '}';
    }
    
}

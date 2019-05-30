/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15.objects.basics;

/**
 * Esta clase nos permite crear objetos de tipo Human
 * @author PC
 */
public class Human {
    private String name;
    private int age;
    private int heightInInches;
    String eyeColor;

    public Human() {
    }
    
    public void speak()
    {
        System.out.println("Hello, my name is " + name);
        System.out.println("I am " + heightInInches + " inches tall");
        System.out.println("I am " + age + " years old");
        System.out.println("My eye color is " + eyeColor);
    }
    
    public void walk()
    {
        System.out.println("Walking...");
    }
    
    public void eat()
    {
        System.out.println("eating...");
    }
    
    public void work()
    {
        System.out.println("working....");
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

    public int getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(int heightInInches) {
        this.heightInInches = heightInInches;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    
}

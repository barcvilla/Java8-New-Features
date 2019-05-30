/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch15.objects.basics;

/**
 *
 * @author PC
 */
public class Earth {
    public static void main(String[] args) {
        Human tom = new Human();
        tom.setAge(5);
        tom.setEyeColor("brown");
        tom.setHeightInInches(72);
        tom.setName("Tomas Brokee");
        
        tom.speak();
    }
}

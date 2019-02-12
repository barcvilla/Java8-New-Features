/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate.ex3;

import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class Test 
{
    public static void main(String[] args) {
        SoftwareEngineer[] softwareEngineers =  {
            new SoftwareEngineer("Durga", 60, false),
            new SoftwareEngineer("Sunil", 25, true),
            new SoftwareEngineer("Sayan", 26, true),
            new SoftwareEngineer("Subby", 28, false),
            new SoftwareEngineer("Ravi", 19, true)
        };
        
        Predicate<SoftwareEngineer> allowed = se -> se.getAge() >= 18 && se.isIsHavingGF() == true;
        for(SoftwareEngineer softwareEngineer : softwareEngineers)
        {
            if(allowed.test(softwareEngineer))
            {
                System.out.println(softwareEngineer);
            }
        }
    }
}

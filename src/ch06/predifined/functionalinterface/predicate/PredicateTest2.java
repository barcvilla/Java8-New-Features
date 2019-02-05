/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class PredicateTest2 {
    public static void main(String[] args) {
        Predicate<String> p = s -> s.length() > 5;
        System.out.println(p.test("hola"));
    }
}

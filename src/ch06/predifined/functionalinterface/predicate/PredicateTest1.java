/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.function.Predicate;

/**
 * Predicate: Es una verificacion de una condicion que puede retornar true or false
 * @author PC
 */
public class PredicateTest1 {
    public static void main(String[] args) {
        Predicate<Integer> p = I -> I > 10;
        System.out.println(p.test(20));
    }
}

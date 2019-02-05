/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch06.predifined.functionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

/**
 *
 * @author PC
 */
public class PredicateTest3 {
    public static void main(String[] args) {
        Predicate<Collection> p = c -> c.isEmpty();
        ArrayList<String> l = new ArrayList<>();
        System.out.println("La lista es vacia? " + p.test(l));
    }
}

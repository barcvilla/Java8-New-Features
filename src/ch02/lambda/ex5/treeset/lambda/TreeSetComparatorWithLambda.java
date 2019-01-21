/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex5.treeset.lambda;

import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class TreeSetComparatorWithLambda {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        nums.add(10);
        nums.add(0);
        nums.add(15);
        nums.add(5);
        nums.add(20);
        
        System.out.println("TreeSet with custom ordering(Descendente): " + nums);
    }
}

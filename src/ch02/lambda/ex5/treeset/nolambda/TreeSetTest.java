/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex5.treeset.nolambda;

import java.util.TreeSet;

/**
 *
 * @author PC
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<Integer> nums = new TreeSet<Integer>();
        nums.add(10);
        nums.add(0);
        nums.add(15);
        nums.add(5);
        nums.add(20);
        System.out.println("TreeSet with default sorting (Ascendente): " + nums);
    }
}

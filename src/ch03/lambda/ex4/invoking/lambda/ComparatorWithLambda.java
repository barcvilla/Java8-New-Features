/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.lambda.ex4.invoking.lambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class ComparatorWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(0);
        nums.add(15);
        nums.add(5);
        nums.add(20);
        // sorting personalizado (descendiente) usando lambda expresion
        Collections.sort(nums, (o1, o2)->(o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        System.out.println("Sorting descendiente using lambda: " + nums);
    }
}

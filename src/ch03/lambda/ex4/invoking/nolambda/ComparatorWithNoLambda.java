/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.lambda.ex4.invoking.nolambda;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC
 */
public class ComparatorWithNoLambda {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(10);
        nums.add(0);
        nums.add(15);
        nums.add(5);
        nums.add(20);
        System.out.println("Before sorting: " + nums);
        //Aplicamos ordemaniento por defecto: Ascendente
        Collections.sort(nums);
        System.out.println("After sorting: " + nums);
        //Aplicamos nuestro ordenamiento personalizado: Descendente
        Collections.sort(nums, new MyComparator());
        System.out.println("Descending sorting: " + nums);
    }
}

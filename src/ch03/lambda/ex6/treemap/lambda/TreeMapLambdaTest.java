/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.lambda.ex6.treemap.lambda;

import java.util.TreeMap;

/**
 *
 * @author PC
 */
public class TreeMapLambdaTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>((o1,o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
        map.put(100, "Durga");
        map.put(400, "Sunny");
        map.put(300, "Bunny");
        map.put(200, "Chinny");
        map.put(700, "Vinny");
        map.put(500, "pinny");
        System.out.println("TreeMap using custom sorting (descendiente) " + map);
    }
}

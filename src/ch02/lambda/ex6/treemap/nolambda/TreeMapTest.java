/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch02.lambda.ex6.treemap.nolambda;

import java.util.TreeMap;

/**
 * TreeMap utiliza por defecto un ordenamiento ascendente basado en el key
 * @author PC
 */
public class TreeMapTest {
    public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(100, "Durga");
        map.put(400, "Sunny");
        map.put(300, "Bunny");
        map.put(200, "Chinny");
        map.put(700, "Vinny");
        map.put(500, "pinny");
        System.out.println("TreeMap with default sorting: " + map);
    }
}

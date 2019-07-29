/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch17.matrices;

import java.util.Vector;

/**
 * Los array pasan sus valores por referencia
 * Los datos primitivos pasan sus valores por valor.
 * @author PC
 */
public class Main {
    //Los vectores son arrays pero java nos ofrece una clase Vector
    private static void vectores()
    {
        //el valor inicial de un vector es 10, pero se le puede indicar la capacidad y  incremente deseado vector(20,5)
        Vector vector = new Vector(20);
        vector.add("A");
        vector.add("B");
        vector.add("C");
        vector.add("D");
        vector.add("E");
        vector.add("F");
        vector.add("G");
        vector.add("H");
        vector.insertElementAt("I", 0);
        System.out.println(vector);
    }
    
    private static void matriz2Dimension()
    {
        int matriz[][] = new int[3][3];// matriz de 2 dimensiones de 3x3
        int tabla[][] = 
        {
            {1,2,3},{4,5,6},{7,8,9}
        };
        
        //Para recorrer una matriz debemos recorrerlo en filas y luego columnas
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.println("index ["+i+"]"+"["+j+"]--" + tabla[i][j]);
            }
        }
    }
    
    private static void matriz3Dimension()
    {
        int x = 3;
        int y = 3;
        int z = 3;
        String cubo[][][] = new String[x][y][z];
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                for(int k = 0; k < z; k++)
                {
                    cubo[i][j][k] = String.valueOf(i) + String.valueOf(j) + String.valueOf(k);
                }
            }
        }
        
        for(int i = 0; i < x; i++)
        {
            for(int j = 0; j < y; j++)
            {
                for(int k = 0; k < z; k++)
                {
                    System.out.println(cubo[i][j][k]);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        //matriz2Dimension();
        //matriz3Dimension();
        vectores();
    }
}

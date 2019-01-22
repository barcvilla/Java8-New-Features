/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch03.lambda.ex4.invoking.nolambda;

import java.util.Comparator;

/**
 * Si obtenemos valor negativo : o1 va antes
 * Si obtenemos valor positivo: o1 va despues
 * Si obtenemos valor cero: ambos valores a comparar son iguales
 * @author PC
 */
public class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        /**
         * Esta evaluacion puede ser reducida a una sola linea
         * return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0
         */
        if(o1 > o2)
        {
            return -1;
        }
        else if(o1 < o2)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14.joda.time;

import java.time.Year;
import java.util.Scanner;

/**
 *
 * @author PC
 */
public class BuilDateFromKeyboard {
    
    public static void readYearFromKeyboard()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year:");
        int input = sc.nextInt();
        Year y = Year.of(input);
        if(y.isLeap())
        {
            System.out.printf("%d year is leap year \n", input);
        }
        else
        {
            System.out.printf("%d year is not leap year \n", input);
        }
    }
    
    public static void main(String[] args) {
        readYearFromKeyboard();
    }
}

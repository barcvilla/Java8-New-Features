/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14.joda.time;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author PC
 */
public class LocalDateTest {
    
    private static LocalDate today = LocalDate.now();
    public static void workingPeriodDate1()
    {
        LocalDate birthday = LocalDate.of(1982, Month.JULY, 20);
        
        //cual es el periodo entre las dos fechas
        Period p = Period.between(birthday, today);
        System.out.printf("Your age is %d year %d months and %d days\n", p.getYears(), p.getMonths(), p.getDays());
    }
    
    public static void workingPeriodDate2()
    {
        LocalDate deathDay = LocalDate.of(1981+60, 7, 20);
        Period p1 = Period.between(today, deathDay);
        int d = p1.getYears() * 365 +p1.getMonths() * 30 + p1.getDays();
        System.out.printf("you will be on earth only %d  days, hurry up to do better things\n", d);
    }
    
    public static void main(String[] args) {
        workingPeriodDate1();
        workingPeriodDate2();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14.joda.time;

import java.time.LocalDateTime;
import java.time.Month;

/**
 *
 * @author PC
 */
public class LocalDateTimeTest 
{
    private static LocalDateTime dt = LocalDateTime.of(1995, Month.MAY, 12, 14, 45);
    
    public static void buildLocalDateTime()
    {
        System.out.println("Local Date Time: " + dt);
    }
    
    public static void addMonthsLocalDateTime(int months)
    {
        System.out.println("Date " + dt +  " plus " + months + " month(s): " + dt.plusMonths(months));
    }
    
    public static void substractaddMonthsLocalDateTime(int months)
    {
        System.out.println("Date " + dt + " minus " + months + " month(s): " + dt.minusMonths(months));
    }
    
    public static void main(String[] args) {
        buildLocalDateTime();
        addMonthsLocalDateTime(6);
        substractaddMonthsLocalDateTime(4);
    }
}

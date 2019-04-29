/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14.joda.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 *
 * @author PC
 */
public class Test {
    
    static int dd,mm,yy,h,m,s,n;
    static LocalDate date = LocalDate.now();
    static LocalTime time = LocalTime.now();
    static LocalDateTime dateTime = LocalDateTime.now();
    
    public static void getLocalDateTime()
    {
        System.out.println("\nUSING LocalDateTime Class");
        System.out.println("==========================");
        System.out.println("La fecha y hora actual: " + dateTime);
    }
    
    public static void getDayOfMonthInLocalDateTime()
    {
        int dd = dateTime.getDayOfMonth();
        System.out.println("Dia del mes " + dd);
    }
    
    public static void getMonthInLocalDateTime()
    {
        int mm = dateTime.getMonthValue();
        System.out.println("Mes: " + mm);
    }
    
    public static void getYearInLocalDateTime()
    {
        int yy = dateTime.getYear();
        System.out.println("Year: " + yy);
    }
    
    public static void getDateInLocalDateTime()
    {
        System.out.printf("Complete Date: %d - %d - %d\n", dd, mm, yy);
    }
    
    public static void getHourInLocalDateTime()
    {
        int h = dateTime.getHour();
        System.out.println("Hour: " + h);
    }
    
    public static void getMinuteInLocalDateTime()
    {
        int m = dateTime.getMinute();
        System.out.println("Minute: " + m);
    }
    
    public static void getNanoInLocalDateTime()
    {
        int n = dateTime.getNano();
        System.out.println("Nano: " + n);
    }
    
    public static void getTimeInLocalDateTime()
    {
        System.out.printf("%d - %d - %d\n", h, m, n);
    }
    
    public static void getLocalDate()
    {
        LocalDate date = LocalDate.now();
        System.out.println("La fecha hoy es: " + date);
    }
    
    public static void getLocalTime()
    {
        LocalTime time = LocalTime.now();
        System.out.println("Local Time es: " + time);
    }
    
    public static void getDayOfMonth()
    {
        dd = date.getDayOfMonth();
        System.out.println("El dia del mes es: " + dd);
    }
    
    public static void getMonthValue()
    {
        mm = date.getMonthValue();
        System.out.println("El mes es: " + mm);
    }
    
    public static void getYearValue()
    {
        yy = date.getYear();
        System.out.println("El año es: " + yy);
    }
    
    public static void formatDate()
    {
        System.out.println("Simple format: " + dd + "-" + mm + "-" + yy);
        System.out.printf("Prepared format: " + "%d-%d-%d\n", dd,mm,yy);
    }
    
    public static void getHourTime()
    {
        h = time.getHour();
        System.out.println("La hora es: " + h);
    }
    
    public static void getMinuteTime()
    {
        m = time.getMinute();
        System.out.println("Los minutos son: " + m);
    }
    
    public static void getSecondsTime()
    {
        s = time.getSecond();
        System.out.println("Los segundo son: " + s);
    }
    
    public static void getNanoSecondsTime()
    {
        n = time.getNano();
        System.out.println("Los nano seconds: " + n);
    }
    
    public static void formatTime()
    {
        System.out.printf("%d:%d:%d:%d\n", h,m,s,n);
    }
    
    public static void main(String[] args) {
        getLocalDate();
        getLocalTime();
        getDayOfMonth();
        getMonthValue();
        getYearValue();
        formatDate();
        getHourTime();
        getMinuteTime();
        getSecondsTime();
        getNanoSecondsTime();
        formatTime();
        getLocalDateTime();
        getDayOfMonthInLocalDateTime();
        getMonthInLocalDateTime();
        getYearInLocalDateTime();
        getDateInLocalDateTime();
        getHourInLocalDateTime();
        getMinuteInLocalDateTime();
        getNanoInLocalDateTime();
        getTimeInLocalDateTime();
    }
}

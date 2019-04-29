/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch14.joda.time;

import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 *
 * @author PC
 */
public class ZoneDateTimeTest {
    
    private static ZoneId zone = ZoneId.systemDefault();
    
    public static void getZoneId()
    {
        System.out.println("System Zoned: " + zone);
    }
    
    public static void createZoneDateTime()
    {
        ZoneId la = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dt = ZonedDateTime.now(la);
        System.out.println("Los angels Zone Date Time: " + dt);
    }
    
    public static void main(String[] args) {
        getZoneId();
        createZoneDateTime();
    }
}

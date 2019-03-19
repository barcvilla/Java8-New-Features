/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch10.predefined.functionalinterface.bifunction.ex3;

/**
 *
 * @author PC
 */
public class TimeSheet 
{
    private int eno;
    private int days;
    
    public TimeSheet(int eno, int days)
    {
        this.eno = eno;
        this.days = days;
    }

    public int getEno() {
        return eno;
    }

    public void setEno(int eno) {
        this.eno = eno;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    @Override
    public String toString() {
        return "TimeSheet{" + "eno=" + eno + ", days=" + days + '}';
    }
    
    
}

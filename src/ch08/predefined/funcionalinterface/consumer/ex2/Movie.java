/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch08.predefined.funcionalinterface.consumer.ex2;

/**
 *
 * @author PC
 */
public class Movie {
    private String name;
    private String hero;
    private String heroine;
    
    public Movie(String name, String hero, String heroine)
    {
        this.name = name;
        this.hero = hero;
        this.heroine = heroine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHero() {
        return hero;
    }

    public void setHero(String hero) {
        this.hero = hero;
    }

    public String getHeroine() {
        return heroine;
    }

    public void setHeroine(String heroine) {
        this.heroine = heroine;
    }
    
    
}

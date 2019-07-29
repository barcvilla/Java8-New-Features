/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.nodos;

/**
 * Nodo que recibe un numero entero
 * @author PC
 */
public class Nodo {
    int dato;
    //un nodo siempre debe tener una ref a otro Nodo
    Nodo ref;
    
    public Nodo(int d)
    {
        dato = d;
    }

    public int getDato() {
        return dato;
    }
    
    public Nodo getRef() {
        return ref;
    }

    public void setRef(Nodo referencia) {
        this.ref = referencia;
    }
    
}

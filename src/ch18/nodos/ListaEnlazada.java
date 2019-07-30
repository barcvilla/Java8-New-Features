/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.nodos;

import java.util.List;

/**
 *
 * @author PC
 */
public class ListaEnlazada {
    protected Nodo primero;
    
    
    public ListaEnlazada()
    {
        primero = null;
    }
    
    /*
    * Metodo agrega nodo al inicio de la Lista
    */
    public ListaEnlazada agregarInicio(int dato)
    {
        Nodo nuevo = new Nodo(dato);
        //necesitamos una referencia
        nuevo.ref = primero;
        primero = nuevo;
        return this;
    }
    
    /*
    * Metodo agrega nodo al final de la lista
    */
    public void agregarFinal(int dato)
    {
        Nodo nuevoF = new Nodo(dato);
        nuevoF.ref = null;
        
        if(primero == null)
        {
            primero = null;
            return;
        }
        //verificamos que llegamos al final. Recorremos Nodos para obtener la referencia
        Nodo tmp;
        for(tmp = primero; tmp.getRef() != null; tmp = tmp.getRef());
        tmp.setRef(nuevoF);
        
    }
    
    /*
    * Metodo buscar un nodo en la lista
    */
    public Nodo buscar(int dato)
    {
        Nodo nodob;
        for(nodob = primero; nodob != null; nodob = nodob.getRef())
        {
            if(dato == nodob.dato)
            {
                return nodob;
            }
        }
        return null;
    }
    
    /*
    * Metodo eliminar un nodo de la lista
    */
    public void eliminar(int dato)
    {
        //boolean que avisa cuando hemos encontrado el elemento
        boolean encontrado;
        //definimos nodo actual y nodo anterior
        Nodo actual, anterior;
        actual = primero; //porque iniciamos desde el principio de la lista
        anterior = null; // al estar al inicio de la lista no hay un anterior por ello null
        encontrado = false; //por defecto no encontrado
        
        //mientras terminamos el recorrido
        while(actual != null && !encontrado)
        {
            encontrado = (actual.dato == dato);
            if(!encontrado)
            {
                anterior = actual;
                actual = actual.getRef();
            }
        }
        
        if(actual != null)
        {
            if(actual == primero)
            {
                primero = actual.ref;
            }
            else
            {
                anterior.setRef(actual.ref);
            }
        }
    }
    
    /*
    * Metodo muestra los nodos de la lista
    */
    public void verLista()
    {
        Nodo nodov = primero;
        while(nodov != null)
        {
            System.out.println(nodov.dato);
            nodov = nodov.ref;
        }
    }
}

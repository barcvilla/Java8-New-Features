/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch18.nodos;

/**
 *
 * @author PC
 */
public class Main {
    
    public static void listEnlazada()
    {
       ListaEnlazada l = new ListaEnlazada();
        l.agregarInicio(1);
        l.agregarInicio(2);
        l.agregarInicio(3);
        l.agregarInicio(4);
        l.agregarFinal(5);
        l.eliminar(2);
        l.verLista(); 
    }
    
    public static void listaEnlazadaOrdenada()
    {
        ListaEnlazadaOrdenada lista = new ListaEnlazadaOrdenada();
        lista.insertarOrden(1);
        lista.insertarOrden(4);
        lista.insertarOrden(2);
        lista.insertarOrden(5);
        lista.verLista();
    }
    
    public static void main(String[] args) {
        listaEnlazadaOrdenada();
    }
}

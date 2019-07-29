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
    public static void main(String[] args) {
        ListaEnlazada l = new ListaEnlazada();
        l.agregarInicio(1);
        l.agregarInicio(2);
        l.agregarInicio(3);
        l.agregarInicio(4);
        l.agregarFinal(5);
        l.eliminar(2);
        l.verLista();
    }
}

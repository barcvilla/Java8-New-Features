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
public class ListaEnlazadaOrdenada extends ListaEnlazada{
    public ListaEnlazadaOrdenada()
    {
        super();
    }
    
    public ListaEnlazadaOrdenada insertarOrden(int dato)
    {
        Nodo nuevo = new Nodo(dato); // primero
        //si es el primero Nodo sera nulo, por lo que hay que asignar el nodo
        if(primero == null)
        {
            primero = nuevo;
        }
        else if(dato < primero.getDato()) // nodoa = 1, nodob = 3 * validamos cuando el primero nodo es menor que el segundo
        {
            nuevo.setRef(primero);
            primero = nuevo;
        }
        else
        { //validamos cuando el primer nodo es mayor y el segundo nodo es menor: nodoa = 10, nodob = 5
            Nodo anterior, primeroListaOrdenada;
            anterior = primeroListaOrdenada = primero;
            while(primeroListaOrdenada.getRef() != null && dato > primeroListaOrdenada.getDato())
            {
                anterior = primeroListaOrdenada;
                primeroListaOrdenada = primeroListaOrdenada.getRef();
            }
            if(dato > primeroListaOrdenada.getDato())
            {
                anterior = primeroListaOrdenada;
            }
            nuevo.setRef(anterior.getRef());
            anterior.setRef(nuevo);
        }
        
        return this;
    }
}

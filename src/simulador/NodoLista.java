/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE SERVIRA PARA ALMACENAR LOS DATOS DE CADA COLUMNA
 */
public class NodoLista<T extends Comparable> {

    /**
     * ATRIBUTOS DE LA CLASE
     */
    private T dato;
    private NodoLista<T> siguiente;

    /**
     * PRIMER CONSTRUCTOR EN EL CUAL SE LE PASA COMO PARAMETRO EL DATO DE
     * CUALQUIER TIPO
     */
    public NodoLista(T dato) {
        this.dato = dato;
        siguiente = null;
    }

    /**
     * SEGUNDO CONSTRUCTOR EN EL CUAL SE INICIALIZAN NUESTRAS VARIABLES
     */
    public NodoLista() {
        dato = null;
        siguiente = null;
    }

    /**
     * SETTERS Y GETTERS
     */
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoLista<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * METODO TOSTRING PARA SOBREESCRIBIR LOS DATOS DE LA MISMA CLASE
     */
    @Override
    public String toString() {
        return dato + " Siguiente---> " + siguiente;
    }

    public T toString2() {
        return dato;
    }
}

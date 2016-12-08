/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE CONTENDRA EL NOMBRE DE CADA TABLA, EN EL CUAL SE
 * INTRODUCIRA A UNA LISTA LIGADA
 */
public class NodoTabla<T extends Comparable> {

    /**
     * ATRIBUTOS PROPIOS QUE CONTENDRA LA LISTA
     */
    private String nombre;
    private NodoTabla<T> siguiente;

    /**
     * PRIMER CONSTRUCTOR PARA PASARLE COMO PARAMETRO EL NOMBRE DE CADA TABLA
     */
    public NodoTabla(String nombre) {
        this.nombre = nombre;
        siguiente = null;
    }

    /**
     * SEGUNDO CONSTRUCTOR PARA PODER INICIALIZAR NUESTROS ATRIBUTOS EN NULL
     */
    public NodoTabla() {
        nombre = null;
        siguiente = null;
    }

    /**
     * SETTERS Y GETTERS DE LOS ATRIBUTOS
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoTabla<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoTabla<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * METODO TOSRTING PARA SOBREESCRIBIR LOS DATOS DEL MISMO
     */
    @Override
    public String toString() {
        return nombre + " Siguiente---> " + siguiente;
    }

}

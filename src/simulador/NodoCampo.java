/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE SERA NUESTRA CLASE NODO DEL CAMPO DE LOS NODOS CAMPO, ES
 * DECIR QUE ESTA CONTENDRA TODOS LOS NOMBRES DE LAS COLUMNAS
 */
public class NodoCampo<T extends Comparable> {

    /**
     * ATRIBUTOS PROPIOS QUE CONTENDRA NUESTRA LISTA LIGADA
     */
    private String nombre;
    private NodoCampo<T> siguiente;

    /**
     * PRIMER CONSTRUCTOR EN EL CUAL SE LE PASA COMO PARAMETRO EL NOMBRE DE CADA
     * COLUMNA PARA PODER ALMACENAR LOS DATOS
     */
    public NodoCampo(String nombre) {
        this.nombre = nombre;
        siguiente = null;
    }

    /**
     * SEGUNDO CONSTRUCTOR PARA INICIALIZAR NUESTROS ATRIBUTOS
     */
    public NodoCampo() {
        this.nombre = nombre;
        siguiente = null;
    }

    /**
     * SETTERS Y GETTERS
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public NodoCampo<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCampo<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * METODO TOSTRING PARA SOBREESCRIBIR LOS DATOS DEL MISMO
     */
    @Override
    public String toString() {
        return nombre + " Siguiente---> " + siguiente;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE SERA NUESTRA LISTA LIGADA DE TABLAS
 */
import javax.swing.JOptionPane;

public class Simulador<T extends Comparable> {

    /**
     * ATRIBUTO QUE ALMACENARA EL NOMBRE DE CADA TABLA
     */
    private NodoTabla<T> inicio;

    /**
     * ESTE METODO INSERTA AL INICIO DE NUESTRA LISTA LIGADA, ES DECIR QUE EL
     * NOMBRE DE CADA TABLA LO ALMACENARA AL INICIO
     */
    public void insertarInicioTabla(String dato) {
        NodoTabla<T> nuevo = new NodoTabla<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    /**
     * ESTE METODO INSERTA AL FINAL DE NUESTRA LISTA LIGADA, ES DECIR QUE EL
     * NOMBRE DE CADA TABLA LO ALMACENARA AL FINAL
     */
    public void insertarFinalTabla(String dato) {
        NodoTabla<T> nuevo = new NodoTabla<T>(dato);
        NodoTabla<T> aux = inicio;
        if (vacia()) {
            insertarInicioTabla(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    /**
     * METODO PARA PODER RECORRER NUESTRA LISTA
     */
    public void recorrer() {
        NodoTabla<T> aux = inicio;
        JOptionPane.showMessageDialog(null, aux.toString());
        aux = aux.getSiguiente();
    }

    /**
     * METODO QUE RETORNA UN TRUE SI LA LISTA LIGADA ESTA VACIA
     */
    public boolean vacia() {
        return inicio == null;
    }

    /**
     * METODO QUE BUSCA EL NOMBRE DE CADA TABLA
     */
    public boolean buscarTabla(String dato) {
        NodoTabla<T> aux = inicio;
        while (aux != null) {
            if (aux.getNombre().compareTo(dato) == 0) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    /**
     * *ESTE METODO SIRVE PARA CONTAR LAS TABLAS
     */
    public int contarTablas() {
        int contador = 0;
        NodoTabla<T> aux = inicio;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    /**
     * ESTE METODO RETORNA UN ARREGLO DE TABLAS
     */
    public T[] recorrer2() {
        NodoTabla<T> aux = inicio;
        T[] tablas = (T[]) new String[contarTablas()];
        int i = 0;
        while (aux != null) {
            tablas[i] = (T) aux.getNombre();
            aux = aux.getSiguiente();
            i++;
        }
        return tablas;
    }

    /**
     * METODO TOSTRING PARA SOBREESCRIBIR LOS DATOS
     */
    public String toString() {
        String s = "";
        s += "[" + inicio + "]-->";
        return s;
    }
}

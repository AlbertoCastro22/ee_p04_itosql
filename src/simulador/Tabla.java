/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE SERA NUESTRA LISTA LIGADA DE NODOSCAMPO
 */
public class Tabla<T extends Comparable> {

    /**
     * UNICO ATRIBUTO EN EL CUAL SERA EL INICIO DE NUESTRA LISTA LIGADA
     */
    NodoCampo<T> inicio;

    /**
     * METODO PARA PODER INSERTAR LOS NOMBRES DE CADA COLUMNA AL INICIO DE
     * NUESTRA LISTA
     */
    public void insertarInicioCampo(String dato) {
        NodoCampo<T> nuevo = new NodoCampo<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    /**
     * METODO PARA PODER INSERTAR LOS NOMBRES DE CADA COLUMNA AL FINAL DE
     * NUESTRA LISTA
     */
    public void insertarFinalCampo(String dato) {
        NodoCampo<T> nuevo = new NodoCampo<T>(dato);
        NodoCampo<T> aux = inicio;
        if (vacia()) {
            insertarInicioCampo(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    /**
     * ESTE METODO ES PARA PODER RECORRER NUESTRA LISTA LIGADA
     */
    public void recorrer() {
        NodoCampo<T> aux = inicio;
        System.out.print(aux.toString());
        aux = aux.getSiguiente();
    }

    /**
     * ESTE METODO SOLO COMPRUEBA QUE LA LISTA ESTE VACIA
     */
    public boolean vacia() {
        return inicio == null;
    }

    /**
     * ESTE METODO SIRVE PARA VERIFICAR SI ESTA UN DATO EN LA LISTA LIGADA, ES
     * DECIR QUE SI ESTA EL NOMBRE DE LA COLUMNA
     */
    public boolean buscarCampo(String dato) {
        NodoCampo<T> aux = inicio;
        while (aux != null) {
            if (aux.getNombre().compareTo(dato) == 0) {
                return true;
            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    /**
     * ESTE METODO ES PARA CONTAR CUANTAS COLUMNAS HAY, SOLO SIRVE EN ESTA CLASE
     */
    public int contarCampos() {
        int contador = 0;
        NodoCampo<T> aux = inicio;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    /**
     * ESTE METODO ES PARA QUE RETORNE UN ARREGLO DE TIPO GENERICO, ES DECIR,
     * QUE RETORNE SU CONTENIDO
     */
    public T[] recorrer2() {
        NodoCampo<T> aux = inicio;
        T[] tablas = (T[]) new String[contarCampos()];
        int i = 0;
        while (aux != null) {
            tablas[i] = (T) aux.getNombre();
            aux = aux.getSiguiente();
            i++;
        }
        return tablas;
    }
}

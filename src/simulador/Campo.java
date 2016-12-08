/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel ESTA CLASE CONTENDRA LOS DATOS DE CADA COLUMNA DE LA TABLA
 */
public class Campo<T extends Comparable> {

    /**
     * ATRIBUTOS EN LOS CUALES SE ALMACENARAN LOS DATOS
     */
    NodoLista<T> inicio;
    T arreglo[];

    /**
     * CONSTRUCTOR EN EL CUAL SE OBTIENEN LOS DATOS MEDIANTE UN ARREGLO DE TIPO
     * GENERICO
     */
    public Campo() {
        //obtenerArreglo();
        recorrer2();
    }

    /**
     * METODO PARA INSERTAR AL INICIO DE LA LISTA, ES DECIR, QUE CADA DATO QUE
     * SE INGRESE SERA ALMACENADO AL INICIO DE LA LISTA
     */
    public void insertarInicioDatos(T dato) {
        NodoLista<T> nuevo = new NodoLista<>(dato);
        if (vacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        }
    }

    /**
     * METODO PARA INSERTAR AL FINAL DE LA LISTA, ES DECIR, QUE CADA DATO QUE SE
     * INGRESE SERA ALMACENADO AL FINAL DE LA LISTA
     */
    public void insertarFinalDatos(T dato) {
        NodoLista<T> nuevo = new NodoLista<T>(dato);
        NodoLista<T> aux = inicio;
        if (vacia()) {
            insertarInicioDatos(dato);
        } else {
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }

    /**
     * METODO PARA PODER RECORRER NUESTRA LISTA LIGADA
     */
    public void recorrer() {
        NodoLista<T> aux = inicio;
        System.out.print(aux.toString());
        aux = aux.getSiguiente();
    }

    /**
     * METODO PARA COMPROBAR QUE LA LISTA ESTE VACIA
     */
    public boolean vacia() {
        return inicio == null;
    }

    /**
     * METODO QUE GUARDA LOS DATOS DE LA LISTA
     */
    public void guardarDatos() {
        int contador = 0;
        NodoLista<T> aux = inicio;
        while (aux != null) {
            arreglo[contador] = (T) aux.getDato();
            aux = aux.getSiguiente();
        }
    }

    /**
     * SE OBTIENEN LOS DATOS INGRESADOS EN EL CUAL SE METEN EN UN ARREGLO
     * GENERICO
     */
    public T[] obtenerArreglo() {
        int contador = 0;
        NodoLista<T> aux = inicio;
        while (aux != null) {
            arreglo[contador] = aux.getDato();
            contador++;
            aux = aux.getSiguiente();
        }
        return arreglo;
    }

    /**
     * SIRVE PARA CONTAR LOS DATOS INGRESADOS A CADA COLUMNA
     */
    public int contarTablas() {
        int contador = 0;
        NodoLista<T> aux = inicio;
        while (aux != null) {
            contador++;
            aux = aux.getSiguiente();
        }
        return contador;
    }

    /**
     * METODO QUE RETORNARA UN ARREGLO GENERIO EN EL CUAL SE GUARDAN LOS DATOS
     * DE CADA COLUMNA
     */
    public T[] recorrer2() {
        NodoLista<T> aux = inicio;
        T[] tablas = (T[]) new String[contarTablas()];
        int i = 0;
        while (aux != null) {
            tablas[i] = (T) aux.getDato();
            aux = aux.getSiguiente();
            System.out.println(tablas[i]);
            i++;
            
        }
        System.out.println("");
        return tablas;
    }

    /**
     * METODO TOSRTING SIRVE PARA SOBREESCRIBIR LOS DATOS DE LA MISMA CLASE
     */
    public String toString() {
        String s = "";
        s += inicio + " Siguiente:" + inicio.getSiguiente();
        return s;
    }
}

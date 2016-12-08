/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

/**
 *
 * @author angel EN ESTA CLASE SIRVE PARA LOS METODOS DE ORDENACION QUE SE
 * DIERON EN CLASE
 */
public class Ordenamiento<T extends Comparable> {

    T aux;

    public T getAux() {
        return aux;
    }

    public void setAux(T aux) {
        this.aux = aux;
    }

    public Ordenamiento() {
        aux = null;
    }

    /**
     * METODO DE LA BARAJA, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public T baraja(T[] arreglo) {
        int i, k;
        @SuppressWarnings("LocalVariableHidesMemberVariable")
        T aux = null;
        
        for (i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            k = i - 1;
            while ((aux.compareTo(arreglo[k]) < 0) && k > 0) {
                arreglo[k + 1] = arreglo[k];
                k = k - 1;
            }
            if (arreglo[k].compareTo(aux) <= 0) {
                arreglo[k + 1] = aux;
                return aux;
            } else {
                arreglo[k + 1] = arreglo[k];
                arreglo[k] = aux;
                return aux;
            }
        }
         System.out.println(aux);
        return aux;
    }

    /**
     * METODO DE LA BURBUJA, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public T[] burbuja(T[] arreglo) {
        T aux = null;

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i].compareTo(arreglo[j]) > 0) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println(aux);
        return arreglo;
    }

    /**
     * METODO DE LA BURBUJA CON SENIAL, SIRVE PARA ORDENAR DE FORMA DESCENDENTE
     */
    public void burbujaSeñal(T arreglo[]) {
        int i = 0;
        boolean bandera = false;
        while (i < arreglo.length && bandera == false) {
            bandera = true;
            for (int j = i; j < arreglo.length; j++) {
                if (arreglo[i].compareTo(arreglo[j]) > 0) {
                    T aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    System.out.println(aux);
                    bandera = false;
                }
               
            }
            i++;
        }
    }

    /**
     * METODO DE LA INSERCIONDIRECTA, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public void insercionBinaria(T arreglo[]) {
        T aux;
        for (int i = 1; i < arreglo.length; i++) {
            aux = arreglo[i];
            int primero = 0;
            int ultimo = i - 1;
            while (primero <= ultimo) {
                int central = (int) (primero + ultimo) / 2;
                if (aux.compareTo(arreglo[central]) <= 0) {
                    ultimo = central - 1;
                } else {
                    primero = central + 1;
                }
            }
            for (int j = i - 1; j >= primero; j--) {
                arreglo[j + 1] = arreglo[j];
            }
            arreglo[primero] = aux;
            System.out.println(aux);
        }
    }

    /**
     * METODO DE LA QUICKSORT, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public void quickSort(T arreglo[], int izq, int der) {
        T pivote = arreglo[izq];
        int i = izq;
        int j = der;
        T aux = null;
        while (i < j) {
            while (arreglo[i].compareTo(pivote) <= 0 && i < j) {
                i++;
            }
            while (arreglo[j].compareTo(pivote) > 0) {
                j--;
            }
            if (i < j) {
                aux = arreglo[i];
                arreglo[i] = arreglo[j];
                arreglo[j] = aux;
            }
            System.out.println(aux);
        }
        arreglo[izq] = arreglo[j];
        arreglo[j] = pivote;
        if (izq < j - 1) {
            quickSort(arreglo, izq, j - 1);
        }
        if (j + 1 < der) {
            quickSort(arreglo, j + 1, der);
        }
        
    }

    /**
     * METODO DE LA SELECCION DIRECTA, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public void seleccionDirecta(T[] arreglo) {
        int i, k, j;
        T menor;
        for (i = 0; i < arreglo.length - 1; i++) {
            menor = arreglo[i];
            k = i;
            for (j = i + 1; j < arreglo.length; j++) {
                if (arreglo[j].compareTo(menor) < 0) {
                    menor = arreglo[j];
                    k = j;
                }
            }
            arreglo[k] = arreglo[i];
            arreglo[i] = menor;
             System.out.println(menor);
        }
    }

    /**
     * METODO DE LA SHAKER, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public void shakeSort(T[] arreglo) {
        int intercambios = 0, comparaciones = 0;
        int i, izq, der, k;
        T aux = null;
        izq = 1;
        der = arreglo.length - 1;
        k = arreglo.length - 1;
        while (izq <= der) {
            for (i = der; i >= izq; i--) {
                comparaciones++;
                if (arreglo[i - 1].compareTo(arreglo[i]) > 0) {
                    intercambios++;
                    aux = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            izq = k + 1;
            for (i = izq; i <= der; i++) {
                comparaciones++;
                if (arreglo[i - 1].compareTo(arreglo[i]) > 0) {
                    intercambios++;
                    aux = arreglo[i - 1];
                    arreglo[i - 1] = arreglo[i];
                    arreglo[i] = aux;
                    k = i;
                }
            }
            der = k - 1;
 System.out.println(aux);
        }
    }

    /**
     * METODO DE LA SHELL, SIRVE PARA ORDENAR DE FORMA ASCENDENTE
     */
    public void shellSort(T arreglo[]) {
        int salto, i;
        T aux = null;
        boolean cambios;
        for (salto = arreglo.length / 2; salto != 0; salto /= 2) {
            cambios = true;
            while (cambios) {
                cambios = false;
                for (i = 0; i < arreglo.length; i++) {
                    for (int j = i; j < arreglo.length; j++) {
                        if (arreglo[i].compareTo(arreglo[j]) > 0) {
                            aux = arreglo[i];
                            arreglo[i] = arreglo[j];
                            arreglo[j] = aux;
                            cambios = true;
                        }
                    }
                }
            }
            System.out.println(aux);
        }
    }

    /**
     * ESTE METODO SIRVE PARA IMPRIMIR NUESTRO ARREGLO DE FORMA ORDENADA
     */
    public void imprimir(T[] arreglo) {
        System.out.print("Arreglo [");
        for (int i = 0; i < arreglo.length; i++) {
            if (i == arreglo.length - 1) {
                System.out.print(arreglo[i] + "]");
            } else {
                System.out.print(arreglo[i] + ",");
            }
        }
    }

    /**
     * METODO TOSTRING PARA SOBREESCRIBIR NUESTRO DATO GENERICO
     */
    public String toString() {
        String s = "";
        s += "[" + aux + "]-->";
        return s;
    }
}

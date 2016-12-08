/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulador;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class Prueba<T> {

    String texto;
    int numerico;

    /**
     * este metodo contendra nuestro menu de opciones
     */
    public void menu() {
        String arreglo[] = new String[100];
        Simulador s = new Simulador();
        Tabla t = new Tabla();
        Campo c = new Campo();
        Ordenamiento o = new Ordenamiento();
        int opcion = 0;

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1.-Crear Tabla\n2.-Añadir Datos \n3.-Eliminar Tabla\n4.-Mostrar tablas\n5.-Salir", 5));
                switch (opcion) {
                    case 1:
                        String nombre = JOptionPane.showInputDialog("Ingresa el nombre de la tabla");
                        s.insertarFinalTabla(nombre);
                        int contador = 0;
                        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Cuantos campos deseas agregar"));
                        while (contador < elementos) {
                            String campo = JOptionPane.showInputDialog("Ingresa el nombre del campo " + (contador + 1));
                            t.insertarFinalCampo(campo);
                            contador++;
                        }
                        break;
                    case 2:
                        String añadir = JOptionPane.showInputDialog("Ingresa el nombre de la tabla a añadir Campos");
                        if (s.buscarTabla(añadir) == true) {
                            String campo = JOptionPane.showInputDialog("Ingresa el nombre del campo a añadir Datos");
                            if (t.buscarCampo(campo) == true) {
                                int tipo2;
                                boolean tipo = false;
                                do {
                                    tipo2 = Integer.parseInt(JOptionPane.showInputDialog("1.-Texto\n2.-Numerico\n3.-Regresar", 3));
                                    switch (tipo2) {
                                        case 1:
                                            tipo = true;
                                            texto = JOptionPane.showInputDialog("Ingresa el dato");
                                            c.insertarFinalDatos(texto);
                                            break;
                                        case 2:
                                            tipo = false;
                                            numerico = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el dato"));
                                            c.insertarFinalDatos(numerico);
                                            break;
                                        case 3:

                                            break;
                                        default:
                                            JOptionPane.showMessageDialog(null, "Opcion No valida");
                                            break;
                                    }
                                } while (tipo2 != 3);
                            } else {
                                JOptionPane.showMessageDialog(null, "No existe el campo");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No existe la tabla");
                        }
                        break;
                    case 3:
                        break;
                    case 4:
                        String mostrarTabla = JOptionPane.showInputDialog("Ingresa el nombre de la tabla a mostrar");
                        if (s.buscarTabla(mostrarTabla) == true) {
                            String mostrarCampo = JOptionPane.showInputDialog("Ingresa el nombre del campo a mostrar");
                            if (t.buscarCampo(mostrarCampo) == true) {
                                int opcion3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Metodos de ordenamiento\n1.-Burbuja"
                                        + "\n2.-Burbuja con Señal"
                                        + "\n3.-Shaker Sort\n4.-Insercion Directa\n5.-Insercion Binaria\n6.-Seleccion Directa\n7.-Shell Sort"
                                        + "\n8.-Quick Sort"));
                                switch (opcion3) {
                                    case 1:

                                        System.out.println("Burbuja:\n" + o.burbuja(c.recorrer2()));

                                        break;
                                    case 2:

                                        o.burbujaSeñal(c.recorrer2());
                                        break;
                                    case 3:

                                        o.shakeSort(c.recorrer2());

                                        break;
                                    case 4:
                                        System.out.println("Baraja\n" + o.baraja(c.recorrer2()));
                                        o.baraja(c.recorrer2());

                                        break;
                                    case 5:
                                        o.insercionBinaria(c.recorrer2());
                                        break;
                                    case 6:
                                        o.seleccionDirecta(c.obtenerArreglo());
                                        break;
                                    case 7:
                                        o.shellSort(c.obtenerArreglo());
                                        break;
                                    case 8:
                                        o.quickSort(c.recorrer2(), 0, c.recorrer2().length);
                                        break;

                                }
                            } else {
                                JOptionPane.showMessageDialog(null, "No se encontro el campo");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontro la tabla");
                        }
                        break;
                }
            } catch (Exception e) {

                e.getMessage();
            }
        } while (opcion != 5);

    }

    public static void main(String[] args) {
        Prueba p = new Prueba();
        p.menu();
    }

}

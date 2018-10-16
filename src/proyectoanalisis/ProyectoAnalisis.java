/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoanalisis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaDiaz
 */
public class ProyectoAnalisis {

    private Connection conexion;
    static Statement s;
    static ResultSet rs;

    /*
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pepe Parra su puta madre masdmk

    }

    public void conectar() {
        try {
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            conexion = DriverManager.getConnection(url, "Analisis", "1234");
            s = conexion.createStatement();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error: " + e);
        }

    }

    public void conectar(String query, String insertar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    Insercion de numeros
     */
    public void insertionSortNumeros(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            int aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > aux) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }

    /*
    Insercion por palabras
     */
    public void insertionSortPalabras(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            String aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && aux.compareToIgnoreCase(lista.get(j)) < 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }

    /*
     rapido por numeros
     */
    public void quickSortNumero(List<Integer> lista, int izq, int der) {

        int i = izq;
        int j = der;

        int pivote = lista.get((izq + der) / 2);

        do {
            while (lista.get(i) < pivote) {
                i++;
            }
            while (lista.get(j) > pivote) {
                j--;
            }

            if (i <= j) {
                int aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                i++;
                j--;

            }
        } while (i <= j);
        if (izq < j) {
            quickSortNumero(lista, izq, j);
        }
        if (i < der) {
            quickSortNumero(lista, i, der);
        }
    }

    /*
     rapido por palabras
     */
    public void quickSortPalabra(List<String> lista, int indiceMenor, int indiceMayor) {

        int i = indiceMenor;
        int j = indiceMayor;

        String pivote = lista.get(indiceMenor + (indiceMayor - indiceMenor) / 2);

        do {
            while (lista.get(i).compareToIgnoreCase(pivote) < 0) {
                i++;
            }
            while (lista.get(j).compareToIgnoreCase(pivote) > 0) {
                j--;
            }

            if (i <= j) {
                String aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                i++;
                j--;

            }
        } while (i <= j);
        if (indiceMenor < j) {
            quickSortPalabra(lista, indiceMenor, j);
        }
        if (i < indiceMayor) {
            quickSortPalabra(lista, i, indiceMayor);
        }
    }

    /*
    Burbuja por numeros
     */
    public void bubbleSortNumero(List<Integer> lista) {

        for (int i = 1; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - i; j++) {
                if (lista.get(j) > lista.get(j + 1)) {
                    int aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }

    }

    /*
    Burbuja por palabra
     */
    public void bubbleSortPalabra(List<String> lista) {

        for (int i = 1; i < lista.size(); i++) {
            for (int j = 0; j < lista.size() - i; j++) {
                if (lista.get(j).compareToIgnoreCase(lista.get(j + 1)) > 0) {
                    String aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }

    }

    /**
     * Seleccion por numero
     */
    public void selectionSortNumero(List<Integer> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            int menor = lista.get(i);
            int pos = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j) < menor) {
                    menor = lista.get(j);
                    pos = j;
                }
            }
            lista.set(pos, lista.get(i));
            lista.set(i, menor);
        }

    }

    /**
     * Seleccion por palabra
     */
    public void selectionSortPalabra(List<String> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            String anterior = lista.get(i);
            int pos = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).compareToIgnoreCase(anterior) < 0) {
                    anterior = lista.get(j);
                    pos = j;
                }
            }
            lista.set(pos, lista.get(i));
            lista.set(i, anterior);
        }
    }

    /*
    Merge por palabra
     */
    public void mergeSortPalabra(int izquierda, int mitadArreglo, int derecha, List<String> lista) {
        int i, j, k;
        List<String> arregloAuxiliar = new ArrayList<>();
        for (i = izquierda; i <= derecha; i++) {
            arregloAuxiliar.set(i, lista.get(i));
        }
        i = izquierda;
        j = mitadArreglo + 1;
        k = izquierda;
        while (i <= mitadArreglo && j <= derecha) {
            if (arregloAuxiliar.get(i).compareToIgnoreCase(arregloAuxiliar.get(j)) <= 0) {
                lista.set(k++, arregloAuxiliar.get(i++));
            } else {
                lista.set(k++, arregloAuxiliar.get(j++));
            }

        }
        while (i <= mitadArreglo) {
            lista.set(k++, arregloAuxiliar.get(i++));
        }
    }

    /*
    Merge por numero
     */
    public void mergeSortNumero(int izquierda, int mitadArreglo, int derecha, List<Integer> lista) {
        int i, j, k;
        List<Integer> intAuxiliar = new ArrayList<>();
        for (i = izquierda; i <= derecha; i++) {
            intAuxiliar.set(i, lista.get(i));
        }
        i = izquierda;
        j = mitadArreglo + 1;
        k = izquierda;
        while (i <= mitadArreglo && j <= derecha) //copia el siguiente elemento mÃ¡s grande
        {
            if (intAuxiliar.get(i) <= intAuxiliar.get(j)) {
                lista.set(k++, intAuxiliar.get(i++));
            } else {
                lista.set(k++, intAuxiliar.get(j++));
            }
        }
        while (i <= mitadArreglo) { //copia los elementos que quedan de la
            lista.set(k++, intAuxiliar.get(i++));//primera mitad (si los hay)
        }

    }

    public static int[] OrdenarBurbujaBidireccional(int[] arregloDesorden) {

        int izquierda = 1, derecha = arregloDesorden.length - 1, ultimo = arregloDesorden.length - 1;

        do {
            for (int i = arregloDesorden.length - 1; i > 0; i--) {
                //Burbuja hacia la izquierda
                //Los valores menores van a la izquierda 
                if (arregloDesorden[i - 1] > arregloDesorden[i]) {
                    int aux = arregloDesorden[i]; // variable auxiliar para poder hacer intercambio de
                    arregloDesorden[i] = arregloDesorden[i - 1];  // posicion
                    arregloDesorden[i - 1] = aux;
                    ultimo = i;
                }
            }
            izquierda = ultimo + 1;
            for (int j = 1; j < arregloDesorden.length; j++) {
                if (arregloDesorden[j - 1] > arregloDesorden[j]) {
                    int aux = arregloDesorden[j];
                    arregloDesorden[j] = arregloDesorden[j - 1];
                    arregloDesorden[j - 1] = aux;
                    ultimo = j;
                }
            }
            derecha = ultimo - 1;
        } while (derecha >= izquierda);

        return arregloDesorden;

    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /*
    Metodo de busqueda binaria
     */
    public int busquedaBinaria(List<Integer> lista, int dato) {
        int n = lista.size();
        int centro = 0;
        int inf = 0;
        int sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (lista.get(centro) == dato) {
                return centro;
            } else if (dato < lista.get(centro)) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    public int busquedaBinariaPalabras(List<String> lista, String dato) {
        int n = lista.size();
        int centro = 0;
        int inf = 0;
        int sup = n - 1;
        while (inf <= sup) {
            centro = (sup + inf) / 2;
            if (lista.get(centro).equalsIgnoreCase(dato)) {
                return centro;
            } else if (dato.compareToIgnoreCase(lista.get(centro)) < 0) {
                sup = centro - 1;
            } else {
                inf = centro + 1;
            }
        }
        return -1;
    }

    /*
    Ordenamiento shell
     */
    public static void shell(int[] arreglo) {
        int i = 0, k = 0, j = 0;
        boolean cambio;

        for (i = arreglo.length / 2; i != 0; i /= 0) {
            cambio = true;
            while (cambio) {
                cambio = false;
                for (j = 0; j < arreglo.length; j++) {
                    if (arreglo[j - i] > arreglo[j]) {
                        k = arreglo[j];
                        arreglo[j] = arreglo[j - i];
                        arreglo[j - i] = k;
                        cambio = true;
                    }
                }
            }
        }
    }
/*Ordenamiento por peine o dobSort*/
    public static void dobSort(int data[]) {

        int i, j, h, t;

        for (h = 1; h <= data.length; h = 3 * h + 1);
        do {
            h = h / 3;
            j = 0;
            while (j < data.length - h) {
                if (data[j] > data[j + h]) {
                    t = data[j];
                    data[j] = data[j + h];
                    data[j + h] = t;
                }
                j++;
            }

        } while (h != 1);
    }
}

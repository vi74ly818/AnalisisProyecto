/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;
 
import modelo.Cancion;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class MetodosNumericos {

    public List<Cancion> burbujaNumerica(List<Cancion> lista) {
        for (int i = 1; i < lista.size(); i++) {
            System.out.println(i);
            for (int j = 0; j < lista.size() - i; j++) {
                if (lista.get(j).getDuracion() > lista.get(j + 1).getDuracion()) {
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, aux);
                }
            }
        }
        return lista;
    }

    public List<Cancion> insertionSortNum(List<Cancion> lista) {
        for (int i = 1; i < lista.size(); i++) {
            Cancion aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j).getDuracion() > aux.getDuracion()) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
        return lista;
    }

    public List<Cancion> mergeSort(List<Cancion> whole) {
        List<Cancion> left = new ArrayList<Cancion>();
        List<Cancion> right = new ArrayList<Cancion>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size() / 2;
            // copy the left half of whole into the left.
            for (int i = 0; i < center; i++) {
                left.add(whole.get(i));
            }

            //copy the right half of whole into the new arraylist.
            for (int i = center; i < whole.size(); i++) {
                right.add(whole.get(i));
            }

            // Sort the left and right halves of the arraylist.
            left = mergeSort(left);
            right = mergeSort(right);

            // Merge the results back together.
            merge(left, right, whole);
        }
        return whole;
    }

    private void merge(List<Cancion> left, List<Cancion> right, List<Cancion> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        // As long as neither the left nor the right ArrayList has
        // been used up, keep taking the smaller of left.get(leftIndex)
        // or right.get(rightIndex) and adding it at both.get(bothIndex).
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ((left.get(leftIndex).getDuracion().compareTo(right.get(rightIndex).getDuracion())) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        List<Cancion> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            // The left ArrayList has been use up...
            rest = right;
            restIndex = rightIndex;
        } else {
            // The right ArrayList has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever ArrayList (left or right) was not used up.
        for (int i = restIndex; i < rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }

    /**
     *
     * @param lista
     * @param izq
     * @param der
     */
    public List<Cancion> quickSortNum(List<Cancion> lista, int izq, int der) {

        int i = izq;
        int j = der;

        Cancion pivote = lista.get((izq + der) / 2);

        do {
            while (lista.get(i).getDuracion() < pivote.getDuracion()) {
                i++;
            }
            while (lista.get(j).getDuracion() > pivote.getDuracion()) {
                j--;
            }

            if (i <= j) {
                Cancion aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                i++;
                j--;

            }
        } while (i <= j);
        if (izq < j) {
            quickSortNum(lista, izq, j);
        }
        if (i < der) {
            quickSortNum(lista, i, der);
        }
        return lista;
    }

    public List<Cancion> selectionSortNum(List<Cancion> lista) {
        for (int i = 0; i < lista.size() - 1; i++) {
            Cancion menor = lista.get(i);
            int pos = i;
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(j).getDuracion() < menor.getDuracion()) {
                    menor = lista.get(j);
                    pos = j;
                }
            }
            lista.set(pos, lista.get(i));
            lista.set(i, menor);
        }
        return lista;

    }

    public List<Cancion> ShellSortNum(List<Cancion> lista) {
        int salto, i, j, k;
        Cancion auxiliar;

        salto = lista.size() / 2;
        while (salto > 0) {
            for (i = salto; i < lista.size(); i++) {
                j = i - salto;
                while (j >= 0) {
                    k = j + salto;
                    if (lista.get(j).getDuracion() <= lista.get(k).getDuracion()) {
                        j = -1;
                    } else {

                        auxiliar = lista.get(j);
                        lista.set(j, lista.get(k));
                        lista.set(k, auxiliar);

                        j -= salto;
                    }
                }

            }
            salto = salto / 2;
        }
        return lista;
    }

    /**
     * Metodo de ordenacion por burbuja bidireccional
     *
     * @param arregloDesorden
     * @return
     */
    public List<Cancion> OrdenarBurbujaBidireccionalNumerico(List<Cancion> lista) {

        int izquierda = 1, derecha = lista.size() - 1, ultimo = lista.size() - 1;

        do {
            for (int i = lista.size() - 1; i > 0; i--) {
                //Burbuja hacia la izquierda
                //Los valores menores van a la izquierda 
                if (lista.get(i - 1).getDuracion() > lista.get(i).getDuracion()) {
                    Cancion aux = lista.get(i); // variable auxiliar para poder hacez intercambio de

                    lista.set(i, lista.get(i - 1));
                    lista.set(i - 1, aux);

                    ultimo = i;
                }
            }
            izquierda = ultimo + 1;
            for (int j = 1; j < lista.size(); j++) {
                //Burbuja hacia la derecha
                //Los valores mayores van a la derecha 
                if (lista.get(j - 1).getDuracion() > lista.get(j).getDuracion()) {
                    Cancion aux = lista.get(j);
                    lista.set(j, lista.get(j - 1));
                    lista.set(j - 1, aux);
                    ultimo = j;
                }
            }
            derecha = ultimo - 1;
        } while (derecha >= izquierda);

        return lista;

    }

   
    public List<Cancion> ordenarGnome(List<Cancion> lista) {
        for (int i = 0; i < lista.size(); i++) {
            burbujaNumerica(lista);
        }
        return lista;
    }
    
    public List<Cancion> peine (List<Cancion> lista) {
                boolean permut = true;
		// A gap starting from the length
		int gap = lista.size();
		int j;
		while((permut) || gap>1) {
			 permut = false;
			
			gap = (int) (gap / 1.3);
                       
                        if(gap<1){
                            gap=1;
                        }
			for (j=0; j<lista.size()-gap; j++) { //j=0
				
				if (lista.get(j).getDuracion() > lista.get(j+gap).getDuracion() ) {
					permut = true;
                                        
                                    // Intercambiamos los dos elementos
                                
                                    int temp = lista.get(j).getDuracion();
                                    lista.get(j).setDuracion(lista.get(j+gap).getDuracion());
                                    lista.get(j+gap).setDuracion(temp);
				}
			}
			
		}
                return lista;
	}

    /**
     *
     * @param lista
     * @param dato
     * @return
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

    public List<Cancion> ordenacionMonticulos(List<Cancion> lista) {
        final int N = lista.size();
        for (int nodo = N / 2; nodo >= 0; nodo--) {
            hacerMonticulo(lista, nodo, N - 1);
        }
        for (int nodo = N - 1; nodo >= 0; nodo--) {
            Cancion tmp = lista.get(0);
            lista.set(0, lista.get(nodo));
            lista.set(nodo, tmp);
            hacerMonticulo(lista, 0, nodo - 1);
        }

        return lista;
    }


    public void hacerMonticulo(List<Cancion> lista, int nodo, int fin) {
        int izq = 2 * nodo + 1;
        int der = izq + 1;
        int may;
        if (izq > fin) {
            return;
        }
        if (der > fin) {
            may = izq;
        } else {
            may = lista.get(izq).getDuracion() > lista.get(der).getDuracion() ? izq : der;
        }
        if (lista.get(nodo).getDuracion() < lista.get(may).getDuracion()) {
            Cancion tmp = lista.get(nodo);
            lista.set(nodo, lista.get(may));
            lista.set(may, tmp);
            hacerMonticulo(lista, may, fin);
        }
    }
}

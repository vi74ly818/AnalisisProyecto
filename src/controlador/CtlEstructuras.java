/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Conexion.Consultas;
import static Estructuras.Array.array;
import static Estructuras.ListaDoble.linkedList;
import Estructuras.ListaSimple;
import static Estructuras.ListaSimple.list;
import static Estructuras.Pila.stack;
import static Estructuras.Cola.queue;
import static Estructuras.ListaArray.arrayList;
import java.sql.SQLException;
import java.util.ArrayList;
import static java.util.Collections.list;
import javax.swing.table.DefaultTableModel;
import modelo.Cancion;

/**
 *
 * @author Pepe
 */
public class CtlEstructuras {
    public static ArrayList<Cancion> cancionArrayList;
    ListaSimple listaSimple = new ListaSimple();
    private static int cantidadDatos;
    Consultas consulta;

    public void llenarLista(int numeroDatos) throws ClassNotFoundException, SQLException {
        cancionArrayList = new ArrayList<>();
        consulta = new Consultas();
        cantidadDatos = numeroDatos;
        cancionArrayList = consulta.selectCancion(numeroDatos);
    }

    public boolean getCantidadDatos() {
        return cancionArrayList.isEmpty();
    }

    public void ingresarTiempo(String tipoDato, String tipoOrdenacion, double tiempoMedido) {
        consulta.insertarTiempos(tipoDato, tipoOrdenacion, cantidadDatos, tiempoMedido);
    }
    
    public DefaultTableModel listarListaSimple() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < list.size(); i++) {
            modelo.addRow(new Object[]{
                list.get(i).getId(),
                list.get(i).getNombre(),
                list.get(i).getDuracion(),
                list.get(i).getLanzamiento()
            });
        }
        return modelo;
    }
    
    public DefaultTableModel listarLinkedList() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < linkedList.size(); i++) {
            modelo.addRow(new Object[]{
                linkedList.get(i).getId(),
                linkedList.get(i).getNombre(),
                linkedList.get(i).getDuracion(),
                linkedList.get(i).getLanzamiento()
            });
        }
        return modelo;
    }
    
    public DefaultTableModel listarPila() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < stack.size(); i++) {
            modelo.addRow(new Object[]{
                stack.get(i).getId(),
                stack.get(i).getNombre(),
                stack.get(i).getDuracion(),
                stack.get(i).getLanzamiento()
            });
        }
        return modelo;
    }
    
    public DefaultTableModel listarCola() {
        Cancion cancion;
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < stack.size(); i++) {
            cancion = queue.poll();
            modelo.addRow(new Object[]{
                cancion.getId(),
                cancion.getNombre(),
                cancion.getDuracion(),
                cancion.getLanzamiento()
            });
            queue.add(cancion);
        }
        return modelo;
    }
    
    public DefaultTableModel listarArrayList() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < arrayList.size(); i++) {
            modelo.addRow(new Object[]{
                arrayList.get(i).getId(),
                arrayList.get(i).getNombre(),
                arrayList.get(i).getDuracion(),
                arrayList.get(i).getLanzamiento()
            });
        }
        return modelo;
    }
    
    public DefaultTableModel listarArray() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < cancionArrayList.size(); i++) {
            modelo.addRow(new Object[]{
                array[i].getId(),
                array[i].getNombre(),
                array[i].getDuracion(),
                array[i].getLanzamiento()
            });
        }
        return modelo;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import Ordenamientos.Consultas;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import modelo.Cancion;

/**
 *
 * @author DanielaDiaz
 * +
 * 
 */
public class Estructuras {

    List<Cancion> canciones;
    Consultas consultas = new Consultas();

    public void insertPila() throws ClassNotFoundException, SQLException {
        Stack<Cancion> pilaCancion = new Stack<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < pilaCancion.size(); i++) {
            pilaCancion.push(canciones.get(i));
        }

    }

    public void insertCola() throws ClassNotFoundException, SQLException {
        Queue<Cancion> colaCancion = new LinkedList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < colaCancion.size(); i++) {
            colaCancion.add(canciones.get(i));
        }
    }

    public void insertList() throws ClassNotFoundException, SQLException {
        List<Cancion> listCancion = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < listCancion.size(); i++) {
            listCancion.add(this.canciones.get(i));
        }

    }

    public void insertLinkedList() throws ClassNotFoundException, SQLException {
        LinkedList<Cancion> linkedListCancion = new LinkedList();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < linkedListCancion.size(); i++) {
            linkedListCancion.add(canciones.get(i));
        }
    }

    public void insertArrayList() throws ClassNotFoundException, SQLException {
        ArrayList<Cancion> arrayListCanciones = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayListCanciones.size(); i++) {
            arrayListCanciones.add(this.canciones.get(i));
        }

    }

    public void insertArray() throws ClassNotFoundException, SQLException {
        Cancion[] arrayCanciones = new Cancion[10];
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayCanciones.length; i++) {
            arrayCanciones[i] = canciones.get(i);
        }
    }

    public void insertHashMap() throws ClassNotFoundException, SQLException {
        HashMap<String, Cancion> hashCancion = new HashMap<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < hashCancion.size(); i++) {
            hashCancion.put(i + "", canciones.get(i));
        }
    }

}

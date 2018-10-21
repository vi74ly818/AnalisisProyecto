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
import javax.swing.JOptionPane;
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
    
    public Stack insertPila() throws ClassNotFoundException, SQLException {
        Stack<Cancion> pilaCancion = new Stack<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < pilaCancion.size(); i++) {
            pilaCancion.push(canciones.get(i));
        }
        return pilaCancion;
    }
    
    public Cancion buscarPila(Cancion cancion) throws ClassNotFoundException, SQLException {
        int posicionCancion;
        Stack<Cancion> pilaCancionBusqueda = new Stack<>();
        if(pilaCancionBusqueda.contains(cancion)){
            posicionCancion = pilaCancionBusqueda.indexOf(cancion);
            return pilaCancionBusqueda.get(posicionCancion);
        }else{
            return null;
        }        
    }
   
     public void modificarPila(Cancion cancion) throws ClassNotFoundException, SQLException{
        Cancion cancion2 = buscarPila(cancion);
        if(cancion2 != null){
            
        }else{
         
        }
    }
    
    public void eliminarPila() throws ClassNotFoundException, SQLException{
        Stack<Cancion> pilaCancionEliminar = new Stack<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < pilaCancionEliminar.size(); i++) {
            pilaCancionEliminar.push(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(pilaCancionEliminar.contains(cancion)){
            pilaCancionEliminar.pop();
        }
    }
    
   

    public void insertCola() throws ClassNotFoundException, SQLException {
        Queue<Cancion> colaCancion = new LinkedList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < colaCancion.size(); i++) {
            colaCancion.add(canciones.get(i));
        }
    }

    public Cancion buscarCola(int id) throws ClassNotFoundException, SQLException {
        Queue<Cancion> colaCancionBusqueda = new LinkedList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < colaCancionBusqueda.size(); i++) {
            colaCancionBusqueda.add(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(colaCancionBusqueda.contains(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
    
    public void eliminarCola() throws ClassNotFoundException, SQLException{
        Queue<Cancion> colaCancionEliminar = new LinkedList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < colaCancionEliminar.size(); i++) {
            colaCancionEliminar.add(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(colaCancionEliminar.contains(cancion)){
            colaCancionEliminar.remove();
        }
    }
    
    public void insertList() throws ClassNotFoundException, SQLException {
        List<Cancion> listCancion = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < listCancion.size(); i++) {
            listCancion.add(this.canciones.get(i));
        }
    }
    
    public Cancion buscarList(int id) throws ClassNotFoundException, SQLException {
        List<Cancion> listCancionBusqueda = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < listCancionBusqueda.size(); i++) {
            listCancionBusqueda.add(this.canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(listCancionBusqueda.contains(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
    
    public void eliminarList() throws ClassNotFoundException, SQLException{
        List<Cancion> listCancionEliminar = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < listCancionEliminar.size(); i++) {
            listCancionEliminar.add(this.canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(listCancionEliminar.contains(cancion)){
            listCancionEliminar.remove(cancion);
        }
    }

    public void insertLinkedList() throws ClassNotFoundException, SQLException {
        LinkedList<Cancion> linkedListCancion = new LinkedList();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < linkedListCancion.size(); i++) {
            linkedListCancion.add(canciones.get(i));
        }
    }
    
    public Cancion buscarLinkedList(int id) throws ClassNotFoundException, SQLException {
        LinkedList<Cancion> linkedListCancionBusqueda = new LinkedList();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < linkedListCancionBusqueda.size(); i++) {
            linkedListCancionBusqueda.add(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(linkedListCancionBusqueda.contains(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
    
    public void eliminarLinkedList() throws ClassNotFoundException, SQLException{
        LinkedList<Cancion> linkedListCancionEliminar = new LinkedList();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < linkedListCancionEliminar.size(); i++) {
            linkedListCancionEliminar.add(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(linkedListCancionEliminar.contains(cancion)){
            linkedListCancionEliminar.remove(cancion);
        }
    }

    public void insertArrayList() throws ClassNotFoundException, SQLException {
        ArrayList<Cancion> arrayListCancion = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayListCancion.size(); i++) {
            arrayListCancion.add(this.canciones.get(i));
        }
    }
    
    public Cancion buscarArrayList(int id) throws ClassNotFoundException, SQLException {
        ArrayList<Cancion> arrayListCancionBusqueda = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayListCancionBusqueda.size(); i++) {
            arrayListCancionBusqueda.add(canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(arrayListCancionBusqueda.contains(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
    
    public void eliminarArrayList() throws ClassNotFoundException, SQLException{
        ArrayList<Cancion> arrayListCancionEliminar = new ArrayList<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayListCancionEliminar.size(); i++) {
            arrayListCancionEliminar.add(this.canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(arrayListCancionEliminar.contains(cancion)){
            arrayListCancionEliminar.remove(cancion);
        }
    }

    public void insertArray() throws ClassNotFoundException, SQLException {
        Cancion[] arrayCancion = new Cancion[10];
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayCancion.length; i++) {
            arrayCancion[i] = canciones.get(i);
        }
    }

    public Cancion buscarArray(int id) throws ClassNotFoundException, SQLException {
        Cancion[] arrayCancionBusqueda = new Cancion[10];
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayCancionBusqueda.length; i++) {
            arrayCancionBusqueda[i] = canciones.get(i);
        }
        Cancion cancion = canciones.get(5);
        if(arrayCancionBusqueda.equals(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
        
    public void eliminarArray() throws ClassNotFoundException, SQLException{
        Cancion[] arrayCancionEliminar = new Cancion[10];
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < arrayCancionEliminar.length; i++) {
            arrayCancionEliminar[i] = canciones.get(i);
        }
        Cancion cancion = canciones.get(5);
        if(arrayCancionEliminar.equals(cancion)){
            arrayCancionEliminar.equals(0);
        }
    }
    
    public void insertHashMap() throws ClassNotFoundException, SQLException {
        HashMap<String, Cancion> hashCancion = new HashMap<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < hashCancion.size(); i++) {
            hashCancion.put(i + "", canciones.get(i));
        }
    }

    public Cancion buscarHashMap(int id) throws ClassNotFoundException, SQLException {
        HashMap<String, Cancion> hashCancionBusqueda = new HashMap<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < hashCancionBusqueda.size(); i++) {
            hashCancionBusqueda.put(i + "", canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(hashCancionBusqueda.containsKey(cancion)){
            return cancion;
        }else{
            return null;
        }        
    }
    
    public void eliminarHashMap() throws ClassNotFoundException, SQLException{
        HashMap<String, Cancion> hashCancionEliminar = new HashMap<>();
        canciones = consultas.selectCancion(10);
        for (int i = 0; i < hashCancionEliminar.size(); i++) {
            hashCancionEliminar.put(i + "", canciones.get(i));
        }
        Cancion cancion = canciones.get(5);
        if(hashCancionEliminar.containsKey(cancion)){
            hashCancionEliminar.remove("", cancion);
        }
    }
}

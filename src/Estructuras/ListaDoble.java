/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import static controlador.CtlEstructuras.cancionArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.util.LinkedList;
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class ListaDoble {
    
    public static  LinkedList<Cancion> linkedList = new LinkedList();
    
    public void insertarListaDoble(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            linkedList.add(i, cancionArrayList.get(i));
        }
    }
    
    public Cancion buscarListaDoble(String duracion, String nombre, String lanzamiento){
        if(!duracion.isEmpty()){
            for (int i = 0; i < linkedList.size(); i++) {
                if(linkedList.get(i).getDuracion() == Integer.parseInt(duracion)){
                    return linkedList.get(i);
                }
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < linkedList.size(); i++) {
                if(linkedList.get(i).getNombre().equals(nombre)){
                    return linkedList.get(i);
                }
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < linkedList.size(); i++) {
                if(linkedList.get(i).getLanzamiento().toString().equals(lanzamiento)){
                    return linkedList.get(i);
                }
            }
        }
        return null;        
    }
    
    public void modificarListaDoble(String duracion, String nombre, String lanzamiento){
        for (int i = 0; i < linkedList.size(); i++) {
            if(!duracion.isEmpty()){
                linkedList.get(i).setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                linkedList.get(i).setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                linkedList.get(i).setLanzamiento(Date.valueOf(lanzamiento));
            }
        }
    }
    
    public void eliminarListaDoble(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            linkedList.remove(0);
        }
    }
    
}

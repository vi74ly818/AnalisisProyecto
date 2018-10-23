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
import java.util.Queue;
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class Cola {
    
    public static Queue<Cancion> queue = new LinkedList<>();
    
    public void insertarCola(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            queue.add(cancionArrayList.get(i));
        }
    }
    
    public Cancion buscarCola(String duracion, String nombre, String lanzamiento){
        Cancion cancion;
        if(!duracion.isEmpty()){
            for (int i = 0; i < queue.size(); i++) {
                cancion = queue.poll();
                if(cancion.getDuracion() == Integer.parseInt(duracion)){
                    queue.add(cancion);
                    return cancion;
                }
                queue.add(cancion);
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < queue.size(); i++) {
                cancion = queue.poll();
                if(cancion.getNombre().equals(nombre)){
                    queue.add(cancion);
                    return cancion;
                }
                queue.add(cancion);
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < queue.size(); i++) {
                cancion = queue.poll();
                if(cancion.getLanzamiento().toString().equals(lanzamiento)){
                    queue.add(cancion);
                    return cancion;
                }
                queue.add(cancion);
            }
        }
        return null;        
    }
    
    public void modificarCola(String duracion, String nombre, String lanzamiento){
        Cancion cancion;
        for (int i = 0; i < queue.size(); i++) {
            cancion = queue.poll();
            if(!duracion.isEmpty()){
                cancion.setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                cancion.setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                cancion.setLanzamiento(Date.valueOf(lanzamiento));
            }
            queue.add(cancion);
        }
    }
    
    public void eliminarCola(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            queue.poll();
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import static controlador.CtlEstructuras.cancionArrayList;
import java.sql.Date;
import java.sql.SQLException;
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class Array {
    
    public static Cancion[] array = new Cancion[1000000];
    
    public void insertarArray(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            array[i] = cancionArrayList.get(i);
        }
    }
    
    public Cancion buscarArray(String duracion, String nombre, String lanzamiento){
        if(!duracion.isEmpty()){
            for (int i = 0; i < array.length; i++) {
                if(array[i].getDuracion() == Integer.parseInt(duracion)){
                    return array[i];
                }
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < array.length; i++) {
                if(array[i].getNombre().equals(nombre)){
                    return array[i];
                }
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < array.length; i++) {
                if(array[i].getLanzamiento().toString().equals(lanzamiento)){
                    return array[i];
                }
            }
        }
        return null;        
    }
    
    public void modificarArray(String duracion, String nombre, String lanzamiento){
        for (int i = 0; i < array.length; i++) {
            if(!duracion.isEmpty()){
                array[i].setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                array[i].setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                array[i].setLanzamiento(Date.valueOf(lanzamiento));
            }
        }
    }
    
    public void eliminarArray(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            array[i] = null;
        }
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import static controlador.CtlEstructuras.cancionArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cancion;

/**
 *
 * @author Pepe
 */
public class ListaSimple {
    
    public static  List<Cancion> list = new ArrayList();
    
    public void insertarListaSimple(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            list.add(i, cancionArrayList.get(i));
            System.out.println(list.get(i).getId());
        }
    }
    
    public Cancion buscarListaSimple(String duracion, String nombre, String lanzamiento){
        if(!duracion.isEmpty()){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getDuracion() == Integer.parseInt(duracion)){
                    return list.get(i);
                }
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getNombre().equals(nombre)){
                    return list.get(i);
                }
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < list.size(); i++) {
                if(list.get(i).getLanzamiento().toString().equals(lanzamiento)){
                    return list.get(i);
                }
            }
        }
        return null;        
    }
    
    public void modificarListaSimple(String duracion, String nombre, String lanzamiento){
        for (int i = 0; i < list.size(); i++) {
            if(!duracion.isEmpty()){
                list.get(i).setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                list.get(i).setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                list.get(i).setLanzamiento(Date.valueOf(lanzamiento));
            }
        }
    }
    
    public void eliminarListaSimple(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            list.remove(0);
        }
    }
    
}

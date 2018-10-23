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
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class ListaArray {
    
    public static ArrayList<Cancion> arrayList = new ArrayList<>();
    
    public void insertarArrayList(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            arrayList.add(i, cancionArrayList.get(i));
            System.out.println(arrayList.get(i).getId());
        }
    }
    
    public Cancion buscarArrayList(String duracion, String nombre, String lanzamiento){
        if(!duracion.isEmpty()){
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getDuracion() == Integer.parseInt(duracion)){
                    return arrayList.get(i);
                }
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getNombre().equals(nombre)){
                    return arrayList.get(i);
                }
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).getLanzamiento().toString().equals(lanzamiento)){
                    return arrayList.get(i);
                }
            }
        }
        return null;        
    }
    
    public void modificarArrayList(String duracion, String nombre, String lanzamiento){
        for (int i = 0; i < arrayList.size(); i++) {
            if(!duracion.isEmpty()){
                arrayList.get(i).setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                arrayList.get(i).setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                arrayList.get(i).setLanzamiento(Date.valueOf(lanzamiento));
            }
        }
    }
    
    public void eliminarArrayList(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            arrayList.remove(0);
        }
    }
}

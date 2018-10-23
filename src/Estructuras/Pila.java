/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estructuras;

import static controlador.CtlEstructuras.cancionArrayList;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Stack;
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class Pila {
    
    public static Stack<Cancion> stack = new Stack<>();
    
    public void insertarPila(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cancionArrayList.size(); i++) {
            stack.add(i, cancionArrayList.get(i));
        }
    }
    
    public Cancion buscarPila(String duracion, String nombre, String lanzamiento){
        if(!duracion.isEmpty()){
            for (int i = 0; i < stack.size(); i++) {
                if(stack.get(i).getDuracion() == Integer.parseInt(duracion)){
                    return stack.get(i);
                }
            }
        }else if(!nombre.equals("")){
            for (int i = 0; i < stack.size(); i++) {
                if(stack.get(i).getNombre().equals(nombre)){
                    return stack.get(i);
                }
            }
        }else if(!lanzamiento.equals("")){
            for (int i = 0; i < stack.size(); i++) {
                if(stack.get(i).getLanzamiento().toString().equals(lanzamiento)){
                    return stack.get(i);
                }
            }
        }
        return null;        
    }
    
    public void modificarPila(String duracion, String nombre, String lanzamiento){
        for (int i = 0; i < stack.size(); i++) {
            if(!duracion.isEmpty()){
                stack.get(i).setDuracion(Integer.parseInt(duracion));
            }
            if(!nombre.equals("")){
                stack.get(i).setNombre(nombre);
            }
            if(!lanzamiento.equals("")){
                stack.get(i).setLanzamiento(Date.valueOf(lanzamiento));
            }
        }
    }
    
    public void eliminarPila(int cantidadDatos) throws ClassNotFoundException, SQLException{
        for (int i = 0; i < cantidadDatos - 1; i++) {
            stack.remove(0);
        }
    }
}

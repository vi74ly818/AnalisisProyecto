/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import Ordenamientos.Consultas;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Cancion;

/**
 *
 * @author Pepe
 */
public class CtlOrdenamientoCancion {

    public static ArrayList<Cancion> cancionArrayList;

  
    
    
    private static int cantidadDatos;
    Consultas consulta;

    public DefaultTableModel listarCanciones() {
        DefaultTableModel modelo;
        String nombreColumnas[] = {"ID", "Nombre", "Duracion", "Lanzamiento"};
        modelo = new DefaultTableModel(new Object[][]{}, nombreColumnas);
        for (int i = 0; i < cancionArrayList.size(); i++) {
            modelo.addRow(new Object[]{
                cancionArrayList.get(i).getId(),
                cancionArrayList.get(i).getNombre(),
                cancionArrayList.get(i).getDuracion(),
                cancionArrayList.get(i).getLanzamiento()
            });
        }
        return modelo;
    }

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
    
}

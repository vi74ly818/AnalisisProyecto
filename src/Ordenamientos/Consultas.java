/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import modelo.Cancion;

/**
 *
 * @author diego
 */
public class Consultas {

    Connection conexion;
    Statement st;
    ResultSet rs;
    PreparedStatement ps;

    /**
     *
     * @param quantity
     * @return
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public ArrayList<Cancion> selectCancion(int var) throws ClassNotFoundException, SQLException {
        Cancion c = new Cancion();
        ArrayList<Cancion> arrCancion = new ArrayList<Cancion>();

        String consulta = ("select * from cancion where rownum <= "+var);

        conexion = Conexion.getConnection();
        st = Conexion.getStatement();
        rs = Conexion.getResultSet(consulta);
        int a = 0;

        while (rs.next() && a < var) {

            c = new Cancion(rs.getString("nombre"),
                    rs.getInt("duracion"),
                    rs.getInt("id"),
                    rs.getDate("lanzamiento"));
            arrCancion.add(a, c);
            a++;
        }
        Iterator<Cancion> nombreIterator = arrCancion.iterator();
        while (nombreIterator.hasNext()) {
            Cancion element = nombreIterator.next();
            System.out.println(element + " / ");
        }
        return arrCancion;
    }
   

    /**
     * 
     * @param nombre
     * @param duracion
     * @param id
     * @param lanzamiento 
     */
    public void insertarTiempos(String tipo_dato, String metodo_estructura, int cantidad_datos, double tiempo_medido) {
        PreparedStatement tiempo;
        try {
            tiempo = this.conexion.prepareStatement("select AUTO_TIEMPOS.NEXTVAL from dual");
            int i = 0;
            ResultSet rst = tiempo.executeQuery();
            if (rst.next()) {
                i = rst.getInt(1);
            }
            
            tiempo = this.conexion.prepareStatement("INSERT INTO TIEMPOS_MEDIDOS(ID, TIPO_DATO, METODO_ESTRUCTURA, CANTIDAD_DATOS, TIEMPO_MEDIDO) VALUES(?, ?, ?, ?, ?)");
            tiempo.setInt(1, i);
            tiempo.setString(2, tipo_dato);
            tiempo.setString(3, metodo_estructura);
            tiempo.setInt(4, cantidad_datos);
            tiempo.setDouble(5, tiempo_medido);
            

            tiempo = this.conexion.prepareStatement("INSERT INTO ANALISIS.TIEMPOS_MEDIDOS(ID, TIPO_DATO, METODO_ESTRUCTURA, CANTIDAD_DATOS, TIEMPO_MEDIDO) VALUES(?, ?, ?, ?, ?)");
            tiempo.setInt(1, i);
            tiempo.setString(2, tipo_dato);
            tiempo.setString(3, metodo_estructura);
            tiempo.setInt(4, cantidad_datos);
            tiempo.setDouble(5, tiempo_medido);
            
            tiempo.executeUpdate();
            System.out.printf("[INFO] Se ha insertado correctamente .\n");
        } catch (SQLException sqlex) {
            System.out.printf("[ERROR] No es posible insertar . Razon: " + sqlex.toString() + ".\n");
        }
    }
}

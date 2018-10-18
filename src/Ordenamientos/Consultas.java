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
    public ArrayList<Cancion> selectCancion(int quantity) throws ClassNotFoundException, SQLException {
        Cancion c = new Cancion();
        ArrayList<Cancion> arrCancion = new ArrayList<Cancion>();

        String consulta = ("select * from cancion order by dbms_random.value");

        conexion = Conexion.getConnection();
        st = Conexion.getStatement();
        rs = Conexion.getResultSet(consulta);
        int a = 0;

        while (rs.next() && a < quantity) {

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
    public void insertarCancion(String nombre, Integer duracion, int id, Date lanzamiento) {
        PreparedStatement cancion;

        try {
            cancion = this.conexion.prepareStatement("");
            int i = 1;
            ResultSet rst = cancion.executeQuery();
            if (rst.next()) {
                i = rst.getInt(1);
            }
            
            cancion = this.conexion.prepareStatement("INSERT INTO CANCION(NOMBRE, DURACION, ID, LANZAMIENTO) VALUES(?, ?, ?, ?)");
            cancion.setString(1, nombre);
            cancion.setInt(2, duracion);
            cancion.setInt(3, id);
            cancion.setDate(4, lanzamiento);
            System.out.printf("[INFO] Se ha insertado correctamente .\n");
        } catch (SQLException sqlex) {
            System.out.printf("[ERROR] No es posible insertar . Razon: " + sqlex.toString() + ".\n");
        }
    }

}

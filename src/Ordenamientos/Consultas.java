/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ordenamientos;

import Conexion.Conexion;
import java.sql.Connection;
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
 public void insertarTiposMedidos(int id, String tipo_dato, String metodo_estructura, int cantidad_datos, double tiempo_medido) {
        PreparedStatement tiempo;

        try {
            tiempo = this.conexion.prepareStatement("");
            int i = 1;

            ResultSet rst = tiempo.executeQuery();
            if (rst.next()) {
                i = rst.getInt(1);

            }
            tiempo = this.conexion.prepareStatement("INSERT INTO TIEMPOS_MEDIDOS (ID, TIPO_DATO,"
                    + " METODO_ESTRUCTURA, CANTIDAD_DATOS, TIEMPO_MEDIDO) VALUES (?, ?, ?, ?, ?)");
            tiempo.setInt(1, id);
            tiempo.setString(2, tipo_dato);
            tiempo.setString(3, metodo_estructura);
            tiempo.setInt(4, cantidad_datos);
            tiempo.setDouble(5, tiempo_medido);
            System.out.printf("[INFO] Se ha insertado correctamente .\n");
        } catch (SQLException sqlex) {
            System.out.printf("[ERROR] No es posible insertar . Razon: " + sqlex.toString() + ".\n");
        }
 }

    public void insertarCancion(int id, String tipo_dato, String metodo_estructura, int cantidad_datos, double tiempo_medido) {
        PreparedStatement tiempo;

        try {
            tiempo = this.conexion.prepareStatement("");
            int i = 1;

            ResultSet rst = tiempo.executeQuery();
            if (rst.next()) {
                i = rst.getInt(1);

            }
            // Hacemos el INSERT
            tiempo = this.conexion.prepareStatement("INSERT INTO TIEMPOS_MEDIDOS (ID, TIPO_DATO,"
                    + " METODO_ESTRUCTURA, CANTIDAD_DATOS, TIEMPO_MEDIDO) VALUES (?, ?, ?, ?, ?)");
            tiempo.setInt(1, id);
            tiempo.setString(2, tipo_dato);
            tiempo.setString(3, metodo_estructura);
            tiempo.setInt(4, cantidad_datos);
            tiempo.setDouble(5, tiempo_medido);
            System.out.printf("[INFO] Se ha insertado correctamente .\n");
        } catch (SQLException sqlex) {
            System.out.printf("[ERROR] No es posible insertar . Razon: " + sqlex.toString() + ".\n");
        }
    }

}

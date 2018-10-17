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

    public boolean InsertCancion(Cancion cancion) throws ClassNotFoundException, SQLException {
        boolean insertion = false;
        String consulta = "insert into cancion values(?,?,?,?)";
        conexion = Conexion.getConnection();
        st = Conexion.getStatement();
        ps = Conexion.getPreparedStatement(consulta);
        ps.setString(1, cancion.getNombre());
        ps.setInt(2, cancion.getDuracion());
        ps.setInt(3, cancion.getId());
        ps.setDate(4, cancion.getLanzamiento());
        ps.executeUpdate();
        return (insertion);

    }

}

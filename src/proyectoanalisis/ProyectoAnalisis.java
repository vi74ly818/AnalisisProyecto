/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoanalisis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DanielaDiaz
 */
public class ProyectoAnalisis {
    
    private Connection conexion;
 static Statement s;
 static ResultSet rs;
/*
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Pepe Parra su puta madre masdmk
    
    
}
    public void conectar()
{
    try{
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    conexion = DriverManager.getConnection(url, "Analisis","1234");
    s = conexion.createStatement(); 
  
    }
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,"error: "+e);
    }
    
}

    public void conectar(String query, String insertar) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void insertionSortNumeros(List<Integer> lista) {
        for (int i = 1; i < lista.size(); i++) {
            int aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && lista.get(j) > aux) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }
     public void insertionSortPalabras(List<String> lista) {
        for (int i = 0; i < lista.size(); i++) {
            String aux = lista.get(i);
            int j = i - 1;
            while (j >= 0 && aux.compareToIgnoreCase(lista.get(j)) < 0) {
                lista.set(j + 1, lista.get(j));
                j--;
            }
            lista.set(j + 1, aux);
        }
    }

    public Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void close() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

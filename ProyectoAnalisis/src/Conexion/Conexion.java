/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author diego
 */



public class Conexion {
private Connection conexion;
 static Statement s;
 static ResultSet rs;
 int cantidadColumnas;
 int cantidadFilas;
  
int contadorDeRegistros=0;
int ubicacionDeRegistro=0;
int buscador=0;
boolean enter=false;
boolean DPIencontrado=false;
String dpi[]=new String[25];
String nombre[]=new String[25];
String direccion[]=new String[25];
String telefono[]=new String[25];
String f_Nac[]=new String[25];
String DPI1="";



 public static void main(String[] args) {
  Conexion obconeccion=new Conexion();
    obconeccion.Conectar();
    
    }
    
    public Connection getConexion() {
        return conexion;
    }

        public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public Conexion Conectar()
    {
        try{
        Class.forName("oracle.jdbc.OracleDriver");
        String BaseDeDatos = "jdbc:oracle:thin:@localhost:1521:XE";
        conexion= DriverManager.getConnection(BaseDeDatos,"ANALISIS","123");
        if(conexion!=null)
        {
        System.out.println("Conexion exitosa a registro");
        }
        else{System.out.println("Conexion fallida");}
        }
        catch(Exception e)
        {System.out.println("error"+e);}
       
    return this;
    }

    public void ingresoEnTabla() 
{
    try
    {
      conectar();
        String result="insert into REGISTROS1 values('"+dpi[contadorDeRegistros]+"','"
                    +nombre[contadorDeRegistros]
                    +"','"+direccion[contadorDeRegistros]+"','"+telefono[contadorDeRegistros]+"','"
                    +f_Nac[contadorDeRegistros]+"',"+
                (   contadorDeRegistros+1)+")";
          s.execute(result); 
            
    
       s.close();
    
            conexion.close();       
    }
    catch(Exception ex)
    {
       
        JOptionPane.showMessageDialog(null,"Error ingresando datos: "+ex);
    }
    
}
    
    public void conectar()
{
    try{
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    conexion = DriverManager.getConnection(url, "Analisis","123");
    s = conexion.createStatement(); 
  
    }
    catch(Exception e)
    {
       JOptionPane.showMessageDialog(null,"error: "+e);
    }
    
}
    
}
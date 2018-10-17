package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author diego
 */
public class Conexion {
     
       
    public static Connection getConnection() throws ClassNotFoundException,SQLException{
    Connection conexion =null;
    Class.forName("oracle.jdbc.OracleDriver");
    conexion=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","Analisis","1234");
    
    return conexion;
   
}
    
 public static  Statement getStatement() throws ClassNotFoundException, SQLException{
     Statement statment=null;
     statment=getConnection().createStatement();
     return statment;
     
 }
 
 public static PreparedStatement getPreparedStatement(String sql) throws ClassNotFoundException, SQLException{
     PreparedStatement preparedStatement=getConnection().prepareStatement(sql);
     
    return preparedStatement;
     
 }
 

 public static ResultSet getResultSet(String sql) throws ClassNotFoundException,SQLException{
     ResultSet resultSet=null;
     resultSet=getStatement().executeQuery(sql);
     return resultSet;
 }
}
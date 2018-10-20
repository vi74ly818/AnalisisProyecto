/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoanalisis;

import Ordenamientos.MetodosNumericos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
        MetodosNumericos n = new MetodosNumericos();
          int i;
            int arr[] = {1,3,4,5,2};
            System.out.println("Heap Sort");   
            System.out.println("\n---------------\n");
            System.out.println("\nUnsorted array\n\n");
            for (i = 0; i < arr.length; i++)
                  System.out.print(" "+arr[i]);
            for(i=arr.length; i>1; i--)
            {
                  n.fnSortHeap(arr, i - 1);
            }
            System.out.println("Sorted array");
            System.out.println("\n---------------\n");
            for (i = 0; i < arr.length; i++)
            {
                  System.out.print(" "+arr[i]);
            }
    }


    
}

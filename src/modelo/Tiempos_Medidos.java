/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Pepe
 */
public class Tiempos_Medidos {
    
    private int id;
    private String tipo_dato;
    private String metodo_estructura;
    private int cantidad_datos;
    private double tiempo_medido;

    public Tiempos_Medidos(int id, String tipo_dato, String metodo_estructura, int cantidad_datos, double tiempo_medido) {
        this.id = id;
        this.tipo_dato = tipo_dato;
        this.metodo_estructura = metodo_estructura;
        this.cantidad_datos = cantidad_datos;
        this.tiempo_medido = tiempo_medido;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_dato() {
        return tipo_dato;
    }

    public void setTipo_dato(String tipo_dato) {
        this.tipo_dato = tipo_dato;
    }

    public String getMetodo_estructura() {
        return metodo_estructura;
    }

    public void setMetodo_estructura(String metodo_estructura) {
        this.metodo_estructura = metodo_estructura;
    }

    public int getCantidad_datos() {
        return cantidad_datos;
    }

    public void setCantidad_datos(int cantidad_datos) {
        this.cantidad_datos = cantidad_datos;
    }

    public double getTiempo_medido() {
        return tiempo_medido;
    }

    public void setTiempo_medido(double tiempo_medido) {
        this.tiempo_medido = tiempo_medido;
    }
    
    
}

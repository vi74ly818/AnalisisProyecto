/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Pepe
 */
public class Cancion {
    private String nombre;
    private double duracion;
    private int id;
    private Date lanzamiento;

    public Cancion(String nombre, double duracion, int id, Date lanzamiento) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.id = id;
        this.lanzamiento = lanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Alakyan
 */
public class Materia {
    private int id_materia;
    private String nombre;
    private int anio_materia;
    private boolean estado;

    public Materia() {
    }

    public Materia(String nombre, int anio_materia, boolean estado) {
        this.nombre = nombre;
        this.anio_materia = anio_materia;
        this.estado = estado;
    }

    public Materia(int id_materia, String nombre, int anio_materia, boolean estado) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.anio_materia = anio_materia;
        this.estado = estado;
    }

    public int getId_Materia() {
        return id_materia;
    }

    public void setId_Materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio_materia() {
        return anio_materia;
    }

    public void setAnio_materia(int anio_materia) {
        this.anio_materia = anio_materia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    

    @Override
    public String toString(){
        return(id_materia+" - "+nombre+" - "+anio_materia+" - "+estado);
    }
    
    
    
    
    
    
}

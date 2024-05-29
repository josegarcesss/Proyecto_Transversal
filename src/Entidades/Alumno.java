/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author Alakyan
 */
public class Alumno {
    private int id_alumno;
    private int dni;
    private String apellido;
    private String nombre;
    private LocalDate fechaN;
    private boolean estado;

    public Alumno() {}

    public Alumno(int dni,String apellido, String nombre, LocalDate fechaN, boolean estado) {
        this.dni=dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    }

    public Alumno(int id_alumno,int dni, String apellido, String nombre, LocalDate fechaN, boolean estado) {
        this.id_alumno = id_alumno;
        this.dni=dni;
        this.apellido = apellido;
        this.nombre=nombre;
        this.fechaN = fechaN;
        this.estado = estado;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_Alumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaN() {
        return fechaN;
    }

    public void setFechaN(LocalDate fechaN) {
        this.fechaN = fechaN;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return(id_alumno+" - "+dni+" - "+apellido+" - "+nombre+" - "+fechaN+" - "+estado);
    } 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

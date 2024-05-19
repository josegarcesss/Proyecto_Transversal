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
    private int id_Alumno;
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate fechaN;
    private boolean estado;

    public Alumno() {}

    public Alumno(int dni,String nombre, String apellido, LocalDate fechaN, boolean estado) {
        this.dni=dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.estado = estado;
    }

    public Alumno(int id_Alumno,int dni, String nombre, String apellido, LocalDate fechaN, boolean estado) {
        this.id_Alumno = id_Alumno;
        this.dni=dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
        this.estado = estado;
    }

    public int getId_Alumno() {
        return id_Alumno;
    }

    public void setId_Alumno(int id_Alumno) {
        this.id_Alumno = id_Alumno;
    }

    public int getDNI() {
        return dni;
    }

    public void setDNI(int dni) {
        this.dni = dni;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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
        return(id_Alumno+" - "+dni+" - "+nombre+" - "+apellido+" - "+fechaN+" - "+estado);
    } 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}

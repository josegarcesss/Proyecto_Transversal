/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author sanbe
 */
public class InscripcionData {
    
    private Connection con;
    private AlumnoData alumData;
    private MateriaData matData;
    
    public InscripcionData(){
        con = Conexion.getConexion();
    }
    
    
    
    
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        List<Materia> materiasCursadas=new ArrayList<>();
        
        String sql = "SELECT inscripcion.id_materia, nombre, año,estado FROM inscripcion JOIN materia ON(inscripcion.id_materia=materia.id_materia) WHERE estado=1 AND inscripcion.id_alumno=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                   Materia materia=new Materia();
                   materia.setId_Materia(rs.getInt("id_materia"));
                   materia.setNombre(rs.getString("nombre"));
                   materia.setAnio_materia(rs.getInt("año"));
                   materia.setEstado(rs.getBoolean("estado"));
                   materiasCursadas.add(materia);
        
                }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*Error* No se pudo obtener las materias del alumno");
        }
        return materiasCursadas;
    }
    
    
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
        List<Materia> materiasNOCursadas=new ArrayList<>();
        
        String sql = "SELECT * FROM materia WHERE estado=1 AND materia.id_materia NOT IN (SELECT materia.id_materia FROM inscripcion JOIN materia ON(inscripcion.id_materia=materia.id_materia) WHERE inscripcion.id_alumno=?)";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                   Materia materia=new Materia();
                   materia.setId_Materia(rs.getInt("id_materia"));
                   materia.setNombre(rs.getString("nombre"));
                   materia.setAnio_materia(rs.getInt("año"));
                   materia.setEstado(rs.getBoolean("estado"));
                   materiasNOCursadas.add(materia);
        
                }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*Error* No se pudo obtener las materias del alumno");
        }
        return materiasNOCursadas;
    }
    
    
    public void GuardarInscripcion(Inscripcion inscripcion){
        String sql="INSERT INTO inscripcion (id_alumno, id_materia, nota) VALUES (?, ?,?)";
        try{
            PreparedStatement ps =con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getAlumno().getId_alumno());
            ps.setInt(2, inscripcion.getMateria().getId_Materia());
            ps.setDouble(3, inscripcion.getNota());
            ps.executeUpdate();
            ResultSet rs= ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setId_Inscripcion(1);
                
                JOptionPane.showMessageDialog(null,"*Inscripcion guardada*");
            }
            ps.close();
            }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*ERROR, no se guardo la inscripcion*");
        }
    }
    
    public List<Alumno> obtenerAlumnosXMateria(int idMateria){
       List<Alumno> alumnos = new ArrayList<>();
       String sql="SELECT * FROM alumno WHERE estado=1 AND id_alumno IN(SELECT id_alumno FROM inscripcion WHERE id_materia=?)";
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idMateria);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                   Alumno alum=new Alumno();
                   alum.setId_Alumno(rs.getInt("id_alumno"));
                   alum.setDNI(rs.getInt("dni"));
                   alum.setNombre(rs.getString("nombre"));
                   alum.setApellido(rs.getString("apellido"));
                   alum.setFechaN(rs.getDate("fechaN").toLocalDate());
                   alum.setEstado(rs.getBoolean("estado"));
                   alumnos.add(alum);
                }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*Error* No se pudo obtener las materias del alumno");
        }
        return alumnos;
    }
    
    public List<Inscripcion> obtenerInscripciones() {
        List<Inscripcion> inscripciones = new ArrayList<>();
        String sql= "SELECT * FROM inscripcion";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Inscripcion inscripcion = new Inscripcion();
                ps.setInt(1, inscripcion.getId_Inscripcion());
                ps.setDouble(2,inscripcion.getNota());
                inscripcion.setAlumno(alumData.buscarAlumno(rs.getInt("id_alumno")));
                inscripcion.setMateria(matData.buscarMateria(rs.getInt("id_materia")));
                inscripciones.add(inscripcion);
            }
            ps.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Error al obtener las inscripciones");
            }
        return inscripciones;
    }
    
    public void borrarInscripcionMateriaAlumno(int id_alumno,int id_materia){
        String sql="DELETE FROM inscripcion WHERE id_alumno=? AND id_materia=?";
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, id_alumno);
            ps.setInt(2, id_materia);
           
            int rs= ps.executeUpdate();
            if (rs>0) {              
                JOptionPane.showMessageDialog(null,"*Inscripcion Eliminada*");
            }else{
                JOptionPane.showMessageDialog(null,"*Datos erroneos*");
            }
            ps.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null,"Error al borrar la inscripcion!");
        }
    }
    
}

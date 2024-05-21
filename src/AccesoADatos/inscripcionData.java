/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import Entidades.Inscripcion;
import Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author sanbe
 */
public class inscripcionData {
    
    private Connection con;
    
    public inscripcionData(){
        con = Conexion.getConexion();
    }
    
    
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        List<Materia> materiasCursadas=new ArrayList<>();
        
        String sql = "SELECT inscripcion.idMateria, nombre. año FROM inscripcion JOIN materia ON(inscrpicion.idMateria=materia.idMateria) WHERE inscrpcion,idAlumno=?";
        try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1,idAlumno);
            ResultSet rs= ps.executeQuery();
            while (rs.next()){
                   Materia materia=new Materia();
                   materia.setId_Materia(rs.getInt("isMateria"));
                   materia.setNombre(rs.getString("nombre"));
                   materia.setAnio_materia(rs.getInt("año"));
                   materiasCursadas.add(materia);
        
                }
            ps.close();
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*Error* No se pudo obtener las materias del alumno");
        }
        return materiasCursadas;
    }
    
    public void GuardarInscripcion(Inscripcion inscripcion){
        String sql="INSERT INTO inscripcion (id_alumno, id_materia) VALUES (?, ?)";
        try{
            PreparedStatement ps =con.prepareStatement(sql);
            ps.setInt(1, inscripcion.getAlumno().getId_alumno());
            ps.setInt(1, inscripcion.getMateria().getId_Materia());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"*Inscripcion guardada*");
            ps.close();
            }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null,"*ERROR, no se guardo la inscripcion*");
        }
    }
    
}

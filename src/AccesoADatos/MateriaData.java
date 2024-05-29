
package AccesoADatos;

import Entidades.Materia;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;



public class MateriaData {
    private Connection con = null;

    public MateriaData() {
        con = Conexion.getConexion();
    }
    
    public void guardarMateria(Materia materia){
        
        try {
            String sql="INSERT INTO materia(nombre, año, estado) VALUES (?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio_materia());
            ps.setBoolean(3,materia.isEstado());
            ps.executeUpdate();
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            JOptionPane.showMessageDialog(null, "Materia añadida con exito");
            }
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Materia");
        }
        
         }
        
    
    public Materia buscarMateria(int id_materia){
        Materia materia=null;
        String sql = "SELECT nombre, año, estado FROM materia WHERE id_materia = ? AND estado = 1";
        PreparedStatement ps = null;
    try {
    ps = con.prepareStatement(sql);
    ps.setInt(1,id_materia );
    ResultSet rs = ps.executeQuery();
    
    if(rs.next()){
     materia=new Materia(); 
     materia.setId_Materia(id_materia);
     materia.setNombre(rs.getString("nombre"));
     materia.setAnio_materia(rs.getInt("año"));
     materia.setEstado(true);
        }else{
        JOptionPane.showMessageDialog(null, "No existe la materia");
        }
    }catch(SQLException ex){
    JOptionPane.showMessageDialog(null, "Error al acceder a la base de datos");
    }
        return materia;

}
    
    public void modificarMateria(Materia materia){
        String sql = "UPDATE materia SET nombre = ? ,  año= ? WHERE id_materia= ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio_materia());
            ps.setInt(3, materia.getId_Materia());
            int exito=ps.executeUpdate();
            if (exito==1) {
                JOptionPane.showMessageDialog(null, "modificado con exito");
            }else {
                JOptionPane.showMessageDialog(null, "La materia no existe");
            }
        } catch (SQLException ex) {
           
            JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
            }      
        }
    
    public void eliminarMateria(int id_materia){
        try {
            String sql = "UPDATE materia SET estado = 0 WHERE id_materia = ? ";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1,id_materia);
            int fila=ps.executeUpdate();
            if (fila==1) {
                JOptionPane.showMessageDialog(null, "se elimino la materia");
            }else{
            JOptionPane.showMessageDialog(null, "no se encontro la materia");
            }
            ps.close();
        } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al ingresar a la base de datos");
        }
    
    }
    
    public List<Materia> listarMateria(){
    
        List<Materia> materias= new ArrayList <>();
    
        try {
            String sql = "SELECT * FROM materia WHERE estado = 1 ";
            PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery();
             
             while(rs.next()){
               Materia materia= new Materia();  
               materia.setId_Materia(rs.getInt("id_materia"));
               materia.setNombre(rs.getString("nombre"));
               materia.setAnio_materia(rs.getInt("año"));
               materia.setEstado(rs.getBoolean("estado"));
               materias.add(materia);
             }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al entrar en la tabla materia");
        }
        return materias;
     
    
    }
    
    
    }
    
    


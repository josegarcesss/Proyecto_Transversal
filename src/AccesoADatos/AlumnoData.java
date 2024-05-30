package AccesoADatos;
import Entidades.Alumno;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AlumnoData {
private Connection con = null;

public AlumnoData() {
con = Conexion.getConexion();
}

public void guardarAlumno(Alumno alumno) {

String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaN, estado) VALUES (?, ?, ?, ?, ?)";
try {
PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
ps.setInt(1, alumno.getDNI());
ps.setString(2, alumno.getApellido());
ps.setString(3, alumno.getNombre());
ps.setDate(4, Date.valueOf(alumno.getFechaN()));//localDate a Date
ps.setBoolean(5, alumno.isEstado()); // if reducido
ps.executeUpdate();
ResultSet rs = ps.getGeneratedKeys();
if (rs.next()) {

    JOptionPane.showMessageDialog(null, "Alumno añadido con exito.");
}
ps.close();

} catch (SQLException ex) {
    JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno"+ex.getMessage());
}

}
public Alumno buscarAlumno(int id) {
Alumno alumno = null;
String sql = "SELECT dni, apellido, nombre, fechaN FROM alumno WHERE id_alumno = ? AND estado = 1";
PreparedStatement ps = null;
try {
ps = con.prepareStatement(sql);
ps.setInt(1,id );
ResultSet rs = ps.executeQuery();

if (rs.next()) {
alumno=new Alumno();
alumno.setId_Alumno(id);
alumno.setDNI(rs.getInt("dni"));
alumno.setApellido(rs.getString("apellido"));
alumno.setNombre(rs.getString("nombre"));
alumno.setFechaN(rs.getDate("fechaN").toLocalDate());
alumno.setEstado(true);


} else {
JOptionPane.showMessageDialog(null, "No existe el alumno");
}

      ps.close();
} catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
}

 return alumno;
 }
 public Alumno buscarAlumnoPorDni(int dni) {
 Alumno alumno = null;
 String sql = "SELECT id_alumno, dni, apellido, nombre, fechaN FROM alumno WHERE dni=? AND estado = 1";
 PreparedStatement ps = null;
 try {
 ps = con.prepareStatement(sql);
 ps.setInt(1,dni );
 ResultSet rs = ps.executeQuery();

 if (rs.next()) {
 alumno=new Alumno();
 alumno.setId_Alumno(rs.getInt("id_alumno"));
 alumno.setDNI(rs.getInt("dni"));
 alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 alumno.setFechaN(rs.getDate("fechaN").toLocalDate());
 alumno.setEstado(true);

 } else {
 JOptionPane.showMessageDialog(null, "No existe el alumno");
}
 ps.close();
} catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno "+ex.getMessage());
 }


 return alumno;
 }

 public List<Alumno> listarAlumnos() {

 List<Alumno> alumnos = new ArrayList<>();
 try {
 String sql = "SELECT * FROM alumno WHERE estado = 1 ";
 PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
 while (rs.next()) {
 Alumno alumno = new Alumno();

 alumno.setId_Alumno(rs.getInt("id_alumno"));
 alumno.setDNI(rs.getInt("dni"));
 alumno.setApellido(rs.getString("apellido"));
 alumno.setNombre(rs.getString("nombre"));
 alumno.setFechaN(rs.getDate("fechaN").toLocalDate());
 alumno.setEstado(rs.getBoolean("estado"));
 alumnos.add(alumno);
 }
 ps.close();

 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno "+ex.getMessage());
 }
 return alumnos;
 }

    

public void modificarAlumno(Alumno alumno) {
    String sql = "UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaN = ? WHERE id_alumno = ?";
    try {
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, alumno.getDNI());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getNombre());
        ps.setDate(4, Date.valueOf(alumno.getFechaN()));
        ps.setInt(5, alumno.getId_alumno());

        int exito = ps.executeUpdate();
        if (exito == 1) {
            JOptionPane.showMessageDialog(null, "Alumno modificado con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró el alumno para modificar");
        }
        ps.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "Error al modificar el alumno: " + ex.getMessage());
    }
}






 


public void eliminarAlumno(int id) {

try {
String sql = "UPDATE alumno SET estado = 0 WHERE id_alumno = ? ";
PreparedStatement ps = con.prepareStatement(sql);
ps.setInt(1, id);
int fila=ps.executeUpdate();

if(fila==1){
JOptionPane.showMessageDialog(null, " Se eliminó el alumno.");
}
ps.close();
} catch (SQLException e) {
JOptionPane.showMessageDialog(null, " Error al acceder a la tabla Alumno");
}
}


}

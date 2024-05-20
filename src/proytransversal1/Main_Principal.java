

package proytransversal1;

import AccesoADatos.AlumnoData;
import Entidades.Alumno;
import java.time.LocalDate;
import java.util.List;


public class Main_Principal {
        //@param args the command line arguments
    public static void main(String[] args) {
        //Guardar Alumno
       LocalDate fecha= LocalDate.of (2000,02,12 );
       Alumno alumno=new Alumno(45116754, "Carlo", "cruz", fecha, true);
       AlumnoData ad=new AlumnoData();
       ad.guardarAlumno(alumno);
       
       //Buscar Alumno 
       Alumno encontrado=ad.buscarAlumno(1);
        System.out.println("Alumno encontrado");
        System.out.println(encontrado);
      
        //Listar todos los Alumnos con estado true 
      List <Alumno> lista= ad.listarAlumnos();
        for (Alumno alumn: lista) {
            System.out.println(alumn);
        }
        
        //modificar un Alumno
       Alumno alumno1=new Alumno(1, 47399322, "armando", "cruz", LocalDate.of(2000, 1, 1), true);
        ad.modificarAlumno(alumno1);
        
        //eliminar un Alumno
        ad.eliminarAlumno(1);
        
       
    

    }

}

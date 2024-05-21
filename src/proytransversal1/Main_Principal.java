

package proytransversal1;

import AccesoADatos.AlumnoData;
import AccesoADatos.MateriaData;
import Entidades.Alumno;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.List;


public class Main_Principal {
        //@param args the command line arguments
    public static void main(String[] args) {
        //Guardar Alumno
//       LocalDate fecha= LocalDate.of (2000,02,12 );
//       Alumno alumno=new Alumno(45116754, "Carlo", "cruz", fecha, true);
//       AlumnoData ad=new AlumnoData();
//       ad.guardarAlumno(alumno);
//       
//       //Buscar Alumno 
//       Alumno encontrado=ad.buscarAlumno(1);
//        System.out.println("Alumno encontrado");
//        System.out.println(encontrado);
//      
//        //Listar todos los Alumnos con estado true 
//      List <Alumno> lista= ad.listarAlumnos();
//        for (Alumno alumn: lista) {
//            System.out.println(alumn);
//        }
//        
//        //modificar un Alumno
//       Alumno alumno1=new Alumno(1, 47399322, "armando", "cruz", LocalDate.of(2000, 1, 1), true);
//        ad.modificarAlumno(alumno1);
//        
//        //eliminar un Alumno
//        ad.eliminarAlumno(1);
//        
       
          Materia mat=new Materia("web", 2010, true);
          MateriaData ad= new MateriaData();
           // ad.guardarMateria(mat);

          //Materia encon= ad.buscarMateria(1);
          //System.out.println(encon);
          
          //Materia mat2=new Materia(1, "Laboratorio", 2020, true);
          //ad.modificarMateria(mat2);
          
          //ad.eliminarMateria(1);
          
          List<Materia> lista= ad.listarMateria();
          for (Materia materia:lista) {
              System.out.println(materia);
        }
    }

}

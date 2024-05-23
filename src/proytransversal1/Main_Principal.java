

package proytransversal1;

import AccesoADatos.AlumnoData;
import AccesoADatos.MateriaData;
import AccesoADatos.InscripcionData;
import Entidades.Alumno;
import Entidades.Inscripcion;
import Entidades.Materia;
import java.time.LocalDate;
import java.util.List;


public class Main_Principal {
        //@param args the command line arguments
    public static void main(String[] args) {
        
        //Guardar Alumno
       LocalDate fecha= LocalDate.of (2000,02,12 );
       Alumno alumno=new Alumno(5,45116754, "Carlo", "cruz", fecha, true);
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
       
          Materia mat=new Materia(3,"web", 2010, true);
//          MateriaData mt= new MateriaData();
//            mt.guardarMateria(mat);

          //Materia encon= ad.buscarMateria(1);
          //System.out.println(encon);
          
          //Materia mat2=new Materia(1, "Laboratorio", 2020, true);
          //ad.modificarMateria(mat2);
          
          //ad.eliminarMateria(1);
          
          InscripcionData inscripData=new InscripcionData();
//          List<Alumno> listar= inscripData.obtenerAlumnosXMateria(15) ;
//          for (Alumno alum:listar){
//              System.out.println(alum);
//        }
//          List<Materia> listMat= inscripData.obtenerMateriasCursadas(14);
//        for(Materia mat1:listMat){
//            System.out.println(mat);
//        }
         
        Inscripcion inscriptPueba=new Inscripcion(alumno,mat,9);
          //inscripData.GuardarInscripcion(inscriptPueba);
          //inscripData.borrarInscripcionMateriaAlumno(16, 18);
          inscripData.actualizarNota(5, 3, 7);
          
    }

}

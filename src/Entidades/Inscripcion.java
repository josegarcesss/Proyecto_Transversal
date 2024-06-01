package Entidades;

/**
 *
 * @author Alakyan
 */
public class Inscripcion {
    private int id_Inscripcion;
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Inscripcion() {}

    public Inscripcion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Inscripcion(int id_Inscripcion, Alumno alumno, Materia materia, double nota) {
        this.id_Inscripcion = id_Inscripcion;
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public int getId_Inscripcion() {
        return id_Inscripcion;
    }

    public void setId_Inscripcion(int id_Inscripcion) {
        this.id_Inscripcion = id_Inscripcion;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Inscripcion{" + "id_Inscripcion=" + id_Inscripcion + ", alumno=" + alumno + ", materia=" + materia + ", nota=" + nota + '}';
    }
    
    
    
    
    
    
    
    
}

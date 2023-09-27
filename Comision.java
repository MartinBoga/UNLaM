package proyecto1;
import java.util.ArrayList;
import java.util.List;

public class Comision {
    private int numeroComision;
    private Materia materia;
    private CicloLectivo cicloLectivo;
    private Profesor profesor;
    private String turno;
    private List<Alumno> alumnos;
    private List<RegistroExamen> registrosExamen;

public Comision(int numeroComision, Materia materia, CicloLectivo cicloLectivo, Profesor profesor) {
        this.numeroComision = numeroComision;
        this.materia = materia;
        this.cicloLectivo = cicloLectivo;
        this.profesor = profesor;
        this.alumnos = new ArrayList<>();
        this.registrosExamen = new ArrayList<>();
        this.turno = turno;
    }

public int getNumeroComision() {
        return numeroComision;
    }

public void setNumeroComision(int numeroComision) {
        this.numeroComision = numeroComision;
    }

public Materia getMateria() {
        return materia;
    }

public void setMateria(Materia materia) {
        this.materia = materia;
    }

public CicloLectivo getCicloLectivo() {
        return cicloLectivo;
    }

public void setCicloLectivo(CicloLectivo cicloLectivo) {
        this.cicloLectivo = cicloLectivo;
    }

public Profesor getProfesor() {
        return profesor;
    }

public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

public List<Alumno> getAlumnos() {
        return alumnos;
    }

public void agregarAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
    }

public List<RegistroExamen> getRegistrosExamen() {
        return registrosExamen;
    }

public void agregarRegistroExamen(RegistroExamen registroExamen) {
        this.registrosExamen.add(registroExamen);
    }
}
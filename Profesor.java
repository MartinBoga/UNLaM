package proyecto1;
import java.util.Date;

public class Profesor {
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private int legajoProfesor;
    private String titulo; // Titulo del profe

public Profesor(String nombre, String apellido, Date fechaNacimiento, Date fechaIngreso, int legajoProfesor, String titulo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.legajoProfesor = legajoProfesor;
        this.titulo = titulo;
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

public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

public Date getFechaIngreso() {
        return fechaIngreso;
    }

public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

public int getNumeroEmpleado() {
        return legajoProfesor;
    }

public void setNumeroEmpleado(int legajoProfesor) {
        this.legajoProfesor = legajoProfesor;
    }

public String getTitulo() {
        return titulo;
    }

public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
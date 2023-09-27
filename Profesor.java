package proyecto1;
import java.util.Date;

public class Profesor {
    private int dni;
    private String nombre;
    private String apellido;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private int legajoProfesor;

public Profesor(int dni, String nombre, String apellido) {
		this.dni = dni;    
		this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.legajoProfesor = legajoProfesor;
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

public int getDni() {
    return dni;
	}

public void setDni(int dni) {
    this.dni = dni;
	}
}
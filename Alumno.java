package proyecto1;
import java.util.Date;

public class Alumno {
    private String nombre;
    private String apellido;
    private int dni;
    private Date fechaNacimiento;
    private Date fechaIngreso;
    private int legajoAlumno;

    public Alumno(String nombre, String apellido, int dni, Date fechaNacimiento, Date fechaIngreso, int legajoAlumno) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaIngreso = fechaIngreso;
        this.legajoAlumno = legajoAlumno;
    }

    public Alumno(int dni2, String nombreAlumno, String apellido2) {
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

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public int getLegajoAlumno() {
        return legajoAlumno;
    }

    public void setLegajoAlumno(int legajoAlumno) {
        this.legajoAlumno = legajoAlumno;
    }
}
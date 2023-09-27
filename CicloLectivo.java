package proyecto1;
import java.util.Date;

public class CicloLectivo {
    private int numeroCiclo;
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Date fechaInscripcionInicio;
    private Date fechaInscripcionFinalizacion;

public CicloLectivo(int numeroCiclo, Date fechaInicio, Date fechaFinalizacion, Date fechaInscripcionInicio, Date fechaInscripcionFinalizacion) {
        this.numeroCiclo = numeroCiclo;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.fechaInscripcionInicio = fechaInscripcionInicio;
        this.fechaInscripcionFinalizacion = fechaInscripcionFinalizacion;
    }

public int getNumeroCiclo() {
        return numeroCiclo;
    }

public void setNumeroCiclo(int numeroCiclo) {
        this.numeroCiclo = numeroCiclo;
    }

public Date getFechaInicio() {
        return fechaInicio;
    }

public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

public Date getFechaFinalizacion() {
        return fechaFinalizacion;
    }

public void setFechaFinalizacion(Date fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

public Date getFechaInscripcionInicio() {
        return fechaInscripcionInicio;
    }

public void setFechaInscripcionInicio(Date fechaInscripcionInicio) {
        this.fechaInscripcionInicio = fechaInscripcionInicio;
    }

public Date getFechaInscripcionFinalizacion() {
        return fechaInscripcionFinalizacion;
    }

public void setFechaInscripcionFinalizacion(Date fechaInscripcionFinalizacion) {
        this.fechaInscripcionFinalizacion = fechaInscripcionFinalizacion;
    }
}

package proyecto1;
import java.util.Date;

public class CicloLectivo {
    private Date fechaInicio;
    private Date fechaFinalizacion;
    private Date fechaInscripcionInicio;
    private Date fechaInscripcionFin;

    public CicloLectivo(Date fechaInicio, Date fechaFinalizacion, Date fechaInscripcionInicio, Date fechaInscripcionFin) {
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.fechaInscripcionInicio = fechaInscripcionInicio;
        this.fechaInscripcionFin = fechaInscripcionFin;
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

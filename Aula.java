package proyecto1;

public class Aula {
    private int numeroAula;
    private int capacidadMaxima;

public Aula(int numeroAula, int capacidadMaxima) {
        this.numeroAula = numeroAula;
        this.capacidadMaxima = capacidadMaxima;
    }

public int getNumeroAula() {
        return numeroAula;
    }

public void setNumeroAula(int numeroAula) {
        this.numeroAula = numeroAula;
    }

public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
package Computador;

public class Processador {

    private int nucleos;

    public Processador() {
        nucleos = 2;

    }

    public Processador(int nucleos) {
        this.nucleos = nucleos;

    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

}

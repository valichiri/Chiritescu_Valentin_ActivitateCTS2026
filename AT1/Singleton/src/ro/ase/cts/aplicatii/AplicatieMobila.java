package ro.ase.cts.aplicatii;

public class AplicatieMobila {
    private String nume;
    private float dimensiune;
    private static AplicatieMobila instanta = null;

    private AplicatieMobila(String nume, float dimensiune) {
        this.nume = nume;
        this.dimensiune = dimensiune;
    }

    public void setNume(String nouNume) {
        this.nume = nouNume;
    }

    public String getNume() {
        return nume;
    }

    public static synchronized AplicatieMobila getInstance() {
        if (instanta == null) {
            instanta = new AplicatieMobila("Aplicatia Mea",20);
        }
        return instanta;
    }
}

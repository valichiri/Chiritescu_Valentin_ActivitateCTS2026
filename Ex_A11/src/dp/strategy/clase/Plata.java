package dp.strategy.clase;

public class Plata {
    private IModalitatePlata modalitate;

    public void setModalitate(IModalitatePlata modalitate) {
        this.modalitate = modalitate;
    }

    public void efectueazaPlata(double suma) {
        if (modalitate == null) {
            throw new IllegalStateException("Modalitatea de plata nu a fost setata!");
        }
        modalitate.efectueazaPlata(suma);
    }
}
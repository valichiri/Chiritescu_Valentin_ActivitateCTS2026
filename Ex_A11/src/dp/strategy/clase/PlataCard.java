package dp.strategy.clase;

public class PlataCard implements IModalitatePlata {
    @Override
    public void efectueazaPlata(double suma) {
        System.out.println("[CARD] Plata efectuata cu cardul bancar: " + suma + " RON");
    }
}
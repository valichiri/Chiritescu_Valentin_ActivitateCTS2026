package dp.strategy.clase;

public class PlataCash implements IModalitatePlata {
    @Override
    public void efectueazaPlata(double suma) {
        System.out.println("[CASH] Plata efectuata cu numerar: " + suma + " RON");
    }
}
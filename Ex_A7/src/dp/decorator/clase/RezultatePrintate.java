package dp.decorator.clase;

public class RezultatePrintate implements IRezultate {
    @Override
    public void publicaRezultate(String pacient) {
        System.out.println("[PRINT] Rezultate printate pentru: " + pacient);
    }
}
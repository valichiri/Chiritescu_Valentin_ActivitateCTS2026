package dp.decorator.clase;

public class RezultateOnlineDecorator extends ARezultateDecorator {
    public RezultateOnlineDecorator(IRezultate decorat) {
        super(decorat);
    }

    @Override
    public void publicaRezultate(String pacient) {
        super.publicaRezultate(pacient);
        System.out.println("[ONLINE] Rezultate publicate pe platforma online pentru: " + pacient);
    }
}
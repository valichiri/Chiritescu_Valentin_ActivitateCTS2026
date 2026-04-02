package dp.decorator.clase;

public abstract class ARezultateDecorator implements IRezultate {
    protected final IRezultate decorat;

    public ARezultateDecorator(IRezultate decorat) {
        this.decorat = decorat;
    }

    @Override
    public void publicaRezultate(String pacient) {
        decorat.publicaRezultate(pacient);
    }
}
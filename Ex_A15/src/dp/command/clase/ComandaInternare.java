package dp.command.clase;

public class ComandaInternare implements IComanda {
    private final Medic medic;
    private final String pacient;

    public ComandaInternare(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.interneazaPacient(pacient);
    }
}
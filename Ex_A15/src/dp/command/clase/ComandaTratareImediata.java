package dp.command.clase;

public class ComandaTratareImediata implements IComanda {
    private final Medic medic;
    private final String pacient;

    public ComandaTratareImediata(Medic medic, String pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.trateazaImediat(pacient);
    }
}
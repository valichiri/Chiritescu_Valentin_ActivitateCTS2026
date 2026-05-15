package dp.command.clase;

public class Medic {
    private final String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    public void interneazaPacient(String pacient) {
        System.out.println("  [Dr." + nume + "] Interneaza pacientul: " + pacient);
    }

    public void trateazaImediat(String pacient) {
        System.out.println("  [Dr." + nume + "] Trateaza IMEDIAT pacientul: " + pacient);
    }
}

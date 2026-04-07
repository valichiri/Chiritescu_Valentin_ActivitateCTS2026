package dp.proxy.clase;

public class Internare implements IInternare {

    @Override
    public void interneazaPacient(String numePacient, boolean areAsigurare) {
        System.out.println("[Internare] Pacientul " + numePacient + " a fost internat cu succes.");
    }
}

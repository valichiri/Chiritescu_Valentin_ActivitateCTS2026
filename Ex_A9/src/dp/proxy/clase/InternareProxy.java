package dp.proxy.clase;

public class InternareProxy implements IInternare {
    private final IInternare internare = new Internare();

    @Override
    public void interneazaPacient(String numePacient, boolean areAsigurare) {
        if (!areAsigurare) {
            System.out.println("[Proxy] Acces REFUZAT pentru " + numePacient + ": nu detine asigurare de sanatate.");
            return;
        }
        System.out.println("[Proxy] Asigurare verificata pentru: " + numePacient + ". Acces PERMIS.");
        internare.interneazaPacient(numePacient, areAsigurare);
    }
}
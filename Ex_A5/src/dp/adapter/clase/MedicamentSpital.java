package dp.adapter.clase;

public class MedicamentSpital implements IMedicamentSpital {
    private final String denumire;

    public MedicamentSpital(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void prezintaReteta() {
        System.out.println("[Spital] Verificare reteta pentru: " + denumire);
    }


    @Override
    public void achizitioneazaMedicament() {
        prezintaReteta();
        System.out.println("[Spital] Medicament achizitionat cu reteta: " + denumire);
    }
}
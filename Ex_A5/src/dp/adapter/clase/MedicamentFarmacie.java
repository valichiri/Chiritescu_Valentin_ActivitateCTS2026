package dp.adapter.clase;

public class MedicamentFarmacie {
    private final String denumire;

    public MedicamentFarmacie(String denumire) {
        this.denumire = denumire;
    }

    public void cumparaMedicament() {
        System.out.println("[Farmacie] Vanzare fara verificare reteta: " + denumire);
    }
}
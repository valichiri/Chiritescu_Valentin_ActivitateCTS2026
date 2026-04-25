package dp.adapter.clase;

public class MedicamentAdapter implements IMedicamentSpital {
    private final MedicamentFarmacie medicamentFarmacie;

    public MedicamentAdapter(MedicamentFarmacie medicamentFarmacie) {
        this.medicamentFarmacie = medicamentFarmacie;
    }

    @Override
    public void prezintaReteta() {
        System.out.println("[Adapter] Farmacia nu efectueaza verificarea retetei.");
    }

    @Override
    public void achizitioneazaMedicament() {
        medicamentFarmacie.cumparaMedicament();
    }
}
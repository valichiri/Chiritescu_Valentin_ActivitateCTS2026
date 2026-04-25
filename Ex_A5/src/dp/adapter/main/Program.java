package dp.adapter.main;

import dp.adapter.clase.IMedicamentSpital;
import dp.adapter.clase.MedicamentAdapter;
import dp.adapter.clase.MedicamentFarmacie;
import dp.adapter.clase.MedicamentSpital;

public class Program {
    public static void main(String[] args) {
        System.out.println("=== Sistem Spital cu reteta ===");
        IMedicamentSpital medicamentSpital = new MedicamentSpital("Paracetamol");
        medicamentSpital.achizitioneazaMedicament();

        System.out.println();
        System.out.println("=== Sistem Farmacie integrat prin Adapter fara reteta ===");
        MedicamentFarmacie medFarmacie = new MedicamentFarmacie("Ibuprofen");
        IMedicamentSpital adapter = new MedicamentAdapter(medFarmacie);
        adapter.achizitioneazaMedicament();
    }
}
package ro.ase.cts.Program;

import ro.ase.cts.dispozitive.Dispozitiv;
import ro.ase.cts.factory.FabricaDispozitive;
import ro.ase.cts.factory.TipDispozitiv;

public class Program {
    public static void main(String[] args) {
        FabricaDispozitive fabrica = FabricaDispozitive.getInstance();
        Dispozitiv laptop = fabrica.getDispozitiv(TipDispozitiv.Laptop,86);
        Dispozitiv telefon = fabrica.getDispozitiv(TipDispozitiv.Smartphone,72);
        Dispozitiv ceas = fabrica.getDispozitiv(TipDispozitiv.Smartwatch,23);

        System.out.println(laptop.toString());
        System.out.println(telefon.toString());
        System.out.println(ceas.toString());

    }
}

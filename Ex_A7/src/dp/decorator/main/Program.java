package dp.decorator.main;

import dp.decorator.clase.IRezultate;
import dp.decorator.clase.RezultateOnlineDecorator;
import dp.decorator.clase.RezultatePrintate;

public class Program {
    public static void main(String[] args) {
        System.out.println("=== Forma initiala (doar print) ===");
        IRezultate printOnly = new RezultatePrintate();
        printOnly.publicaRezultate("Ion Popescu");

        System.out.println();
        System.out.println("=== Cu functionalitate online adaugata (Decorator) ===");
        IRezultate cuOnline = new RezultateOnlineDecorator(new RezultatePrintate());
        cuOnline.publicaRezultate("Maria Ionescu");
    }
}

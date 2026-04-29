package dp.strategy.main;

import dp.strategy.clase.Plata;
import dp.strategy.clase.PlataCard;
import dp.strategy.clase.PlataCash;

public class Program {
    public static void main(String[] args) {
        Plata plata = new Plata();

        System.out.println("Pacientul Ion Popescu alege plata cu cardul:");
        plata.setModalitate(new PlataCard());
        plata.efectueazaPlata(375.50);

        System.out.println();
        System.out.println("Pacientul Marian Stancu alege plata cash:");
        plata.setModalitate(new PlataCash());
        plata.efectueazaPlata(250.00);

        System.out.println();
        System.out.println("Pacientul Andrei Pop schimba modalitatea la card:");
        plata.setModalitate(new PlataCard());
        plata.efectueazaPlata(120.00);
    }
}
package dp.command.main;

import dp.command.clase.ComandaInternare;
import dp.command.clase.ComandaTratareImediata;
import dp.command.clase.Medic;
import dp.command.clase.OperatorTriaj;

public class Program {
    public static void main(String[] args) {
        Medic medic = new Medic("Ionescu");
        OperatorTriaj operator = new OperatorTriaj();

        operator.adaugaComanda(new ComandaTratareImediata(medic, "Ion Pop"));
        operator.adaugaComanda(new ComandaInternare(medic, "Maria Stan"));
        operator.adaugaComanda(new ComandaTratareImediata(medic, "Vlad Rus"));
        operator.adaugaComanda(new ComandaInternare(medic, "Ana Popa"));
        operator.adaugaComanda(new ComandaInternare(medic, "Andrei Dan"));

        System.out.println();
        operator.proceseazaComenzi();
    }
}

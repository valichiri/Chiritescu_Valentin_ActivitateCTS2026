package dp.composite.main;

import dp.composite.clase.Departament;
import dp.composite.clase.Sectie;

public class Program {
    public static void main(String[] args) {
        Departament spital = new Departament("Spital");


        Departament chirurgie = new Departament("Chirurgie");
        chirurgie.adauga(new Sectie("Chirurgie Generala"));
        chirurgie.adauga(new Sectie("Neurochirurgie"));
        chirurgie.adauga(new Sectie("Chirurgie Plastica"));

        Departament medicina = new Departament("Medicina Interna");
        medicina.adauga(new Sectie("Cardiologie"));
        medicina.adauga(new Sectie("Gastroenterologie"));
        medicina.adauga(new Sectie("Pneumologie"));

        Departament pediatrie = new Departament("Pediatrie");
        pediatrie.adauga(new Sectie("Neonatologie"));
        pediatrie.adauga(new Sectie("Pediatrie Generala"));

        spital.adauga(chirurgie);
        spital.adauga(medicina);
        spital.adauga(pediatrie);
        spital.adauga(new Sectie("Urgente"));
        spital.adauga(new Sectie("Laborator Analize"));

        spital.afiseaza("");
    }
}
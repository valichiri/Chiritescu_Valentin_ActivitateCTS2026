package dp.composite.clase;

import java.util.ArrayList;
import java.util.List;

// Composite - contine subdepartamente sau sectii
public class Departament implements IComponentaSpital {
    private final String nume;
    private final List<IComponentaSpital> componente = new ArrayList<>();

    public Departament(String nume) {
        this.nume = nume;
    }

    public void adauga(IComponentaSpital c)  { componente.add(c); }
    public void elimina(IComponentaSpital c) { componente.remove(c); }


    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + "+ Departament: " + nume);
        for (IComponentaSpital c: componente) {
            c.afiseaza(indent + "  ");
        }
    }
}

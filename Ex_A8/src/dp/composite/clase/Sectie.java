package dp.composite.clase;

// Leaf
public class Sectie implements IComponentaSpital {
    private final String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }


    @Override
    public void afiseaza(String indent) {
        System.out.println(indent + "|- Sectie: " + nume);
    }
}



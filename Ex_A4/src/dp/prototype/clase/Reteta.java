package dp.prototype.clase;

public class Reteta implements Cloneable {
    private String denumire;
    private String compozitie;
    private double cantitate;

    public Reteta(String denumire, String compozitie, double cantitate) {
        this.denumire    = denumire;
        this.compozitie  = compozitie;
        this.cantitate   = cantitate;
        System.out.println("[Reteta] Constructor apelat pentru: " + denumire);
    }

    public String getDenumire()           { return denumire; }
    public String getCompozitie()         { return compozitie; }
    public double getCantitate()          { return cantitate; }
    public void setDenumire(String d)     { this.denumire = d; }
    public void setCantitate(double c)    { this.cantitate = c; }


    @Override
    public Reteta clone() {
        try {
            Reteta copie = (Reteta) super.clone();
            System.out.println("[Reteta] Clona creata pentru: " + denumire);
            return copie;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return "Reteta{denumire='" + denumire + "', compozitie='" + compozitie +
                "', cantitate=" + cantitate + '}';
    }
}

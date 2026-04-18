package dp.flyweight.clase;

public class DatePacient {
    private final String nume;
    private final String telefon;
    private final String adresa;

    public DatePacient(String nume, String telefon, String adresa) {
        this.nume = nume;
        this.telefon = telefon;
        this.adresa = adresa;
    }

    public String getNume() { return nume; }
    public String getTelefon() { return telefon; }
    public String getAdresa() { return adresa; }

    @Override
    public String toString() {
        return "DatePacient{" + nume + ", tel=" + telefon + ", adr=" + adresa + "}";
    }
}

package dp.flyweight.clase;

public class Internare {
    private final DatePacient datePacient;
    private final int nrSalon;
    private final int nrPat;
    private final int nrZile;


    public Internare(DatePacient datePacient, int nrSalon, int nrPat, int nrZile) {
        this.datePacient = datePacient;
        this.nrSalon = nrSalon;
        this.nrPat = nrPat;
        this.nrZile = nrZile;
    }

    @Override
    public String toString() {
        return "Internare{" + datePacient +
                ", salon=" + nrSalon +
                ", pat="   + nrPat   +
                ", zile="  + nrZile  + "}";
    }
}

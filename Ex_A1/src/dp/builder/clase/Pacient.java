package dp.builder.clase;

public class Pacient {
    private final String nume;
    private final boolean patRabatabil;
    private final boolean micDejunInclus;
    private final boolean papuciCamera;
    private final boolean halatInterior;

    private Pacient(Builder builder) {
        this.nume           = builder.nume;
        this.patRabatabil   = builder.patRabatabil;
        this.micDejunInclus = builder.micDejunInclus;
        this.papuciCamera   = builder.papuciCamera;
        this.halatInterior  = builder.halatInterior;
    }

    public String getNume()           { return nume; }
    public boolean isPatRabatabil()   { return patRabatabil; }
    public boolean isMicDejunInclus() { return micDejunInclus; }
    public boolean isPapuciCamera()   { return papuciCamera; }
    public boolean isHalatInterior()  { return halatInterior; }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", patRabatabil=" + patRabatabil +
                ", micDejunInclus=" + micDejunInclus +
                ", papuciCamera=" + papuciCamera +
                ", halatInterior=" + halatInterior +
                '}';
    }



    public static class Builder {
        private final String nume;
        private boolean patRabatabil   = false;
        private boolean micDejunInclus = false;
        private boolean papuciCamera   = false;
        private boolean halatInterior  = false;

        public Builder(String nume) { this.nume = nume; }

        public Builder cuPatRabatabil()  { this.patRabatabil   = true; return this; }
        public Builder cuMicDejun()      { this.micDejunInclus = true; return this; }
        public Builder cuPapuci()        { this.papuciCamera   = true; return this; }
        public Builder cuHalat()         { this.halatInterior  = true; return this; }

        public Pacient build() { return new Pacient(this); }
    }
}


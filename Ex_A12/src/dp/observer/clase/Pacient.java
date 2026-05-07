package dp.observer.clase;

public class Pacient implements IObserver {
    private final String nume;

    public Pacient(String nume) {
        this.nume = nume;
    }


    @Override
    public void notifica(String mesaj) {
        System.out.println("  >> Pacient [" + nume + "] a primit notificarea: " + mesaj);
    }
}
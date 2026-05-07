package dp.observer.clase;

import java.util.ArrayList;
import java.util.List;

public class SpitalNotificator implements ISubiect {
    private final List<IObserver> abonati = new ArrayList<>();

    @Override
    public void aboneaza(IObserver observer) {
        abonati.add(observer);
    }

    @Override
    public void dezaboneaza(IObserver observer) {
        abonati.remove(observer);
    }

    @Override
    public void notificaToti(String mesaj) {
        System.out.println("[Spital] Trimitere ALERTA (" + abonati.size() + " abonati): " + mesaj);
        for (IObserver obs : abonati) {
            obs.notifica(mesaj);
        }
    }
}
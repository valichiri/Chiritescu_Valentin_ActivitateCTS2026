package dp.flyweight.clase;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
    private static final Map<String, DatePacient> cache = new HashMap<>();

    public static DatePacient getDatePacient(String nume, String telefon, String adresa) {
        String cheie = nume + "|" + telefon + "|" + adresa;
        if (!cache.containsKey(cheie)) {
            cache.put(cheie, new DatePacient(nume, telefon, adresa));
            System.out.println("[Factory] Instanta NOUA creata pentru: " + nume);
        } else {
            System.out.println("[Factory] Instanta REUTILIZATA pentru: " + nume);
        }
        return cache.get(cheie);
    }

    public static int getNumarInstante() {
        return cache.size();
    }
}

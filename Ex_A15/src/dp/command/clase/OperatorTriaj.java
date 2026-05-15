package dp.command.clase;

import java.util.LinkedList;
import java.util.Queue;

public class OperatorTriaj {
    private final Queue<IComanda> coadaComenzi = new LinkedList<>();

    public void adaugaComanda(IComanda comanda) {
        coadaComenzi.add(comanda);
        System.out.println("[Operator] Comanda adaugata in coada. Comenzi in asteptare: " + coadaComenzi.size());
    }

    public void proceseazaComenzi() {
        System.out.println("[Operator] Procesare " + coadaComenzi.size() + " comenzi...");
        while (!coadaComenzi.isEmpty()) {
            coadaComenzi.poll().executa();
        }
        System.out.println("[Operator] Toate comenzile au fost procesate.");
    }
}

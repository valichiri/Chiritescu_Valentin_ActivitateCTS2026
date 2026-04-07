package dp.proxy.main;

import dp.proxy.clase.IInternare;
import dp.proxy.clase.InternareProxy;

public class Program {
    public static void main(String[] args) {
        IInternare internare = new InternareProxy();

        internare.interneazaPacient("Ion Popescu",  true);
        internare.interneazaPacient("Marian Stan",  false);
        internare.interneazaPacient("Maria Ionescu",true);
        internare.interneazaPacient("Radu Popa",    false);
    }
}
package dp.observer.main;

import dp.observer.clase.Pacient;
import dp.observer.clase.SpitalNotificator;

public class Program {
    public static void main(String[] args) {
        SpitalNotificator notificator = new SpitalNotificator();

        Pacient p1 = new Pacient("Ion Popescu");
        Pacient p2 = new Pacient("Marian Stancu");
        Pacient p3 = new Pacient("Andrei Popa");
        Pacient p4 = new Pacient("Radu Ionescu");

        notificator.aboneaza(p1);
        notificator.aboneaza(p2);
        notificator.aboneaza(p3);
        notificator.aboneaza(p4);

        notificator.notificaToti("ALERTA: Virus gripal raspandit in oras!");


        System.out.println();
        System.out.println("Marian Stancu s-a dezabonat.");
        notificator.dezaboneaza(p2);
        notificator.notificaToti("ALERTA: Epidemie COVID varianta noua detectata!");
    }
}
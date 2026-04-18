package dp.flyweight.main;

import dp.flyweight.clase.DatePacient;
import dp.flyweight.clase.FlyweightFactory;
import dp.flyweight.clase.Internare;

public class Program {
    public static void main(String[] args) {
        DatePacient dp1 = FlyweightFactory.getDatePacient("Ion Pop", "0721000001", "Cluj");
        DatePacient dp2 = FlyweightFactory.getDatePacient("Ion Pop", "0721000001", "Cluj");
        DatePacient dp3 = FlyweightFactory.getDatePacient("Ion Pop", "0721000001", "Cluj");



        DatePacient dp4 = FlyweightFactory.getDatePacient("Maria Stan", "0731000002", "Brasov");



        Internare i1 = new Internare(dp1, 5, 2, 3);
        Internare i2 = new Internare(dp2, 7, 1, 7);
        Internare i3 = new Internare(dp3, 3, 4, 2);
        Internare i4 = new Internare(dp4, 1, 3, 5);


        System.out.println();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        System.out.println();
        System.out.println("Numar instante DatePacient in memorie: " + FlyweightFactory.getNumarInstante() + " (din 4 internari)");
        System.out.println("dp1 == dp2: " + (dp1 == dp2));
    }
}

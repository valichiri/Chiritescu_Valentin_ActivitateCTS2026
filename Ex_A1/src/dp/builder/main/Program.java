package dp.builder.main;

import dp.builder.clase.Pacient;

public class Program {
    public static void main(String[] args) {
        Pacient p1 = new Pacient.Builder("Ion Popescu")
                .cuPatRabatabil()
                .cuMicDejun()
                .cuPapuci()
                .cuHalat()
                .build();
        System.out.println(p1);


        Pacient p2 = new Pacient.Builder("Maria Ionescu").build();
        System.out.println(p2);


        Pacient p3 = new Pacient.Builder("Mircea Stan")
                .cuMicDejun()
                .cuHalat()
                .build();
        System.out.println(p3);
    }
}

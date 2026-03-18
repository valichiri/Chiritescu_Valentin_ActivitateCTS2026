package dp.prototype.main;

import dp.prototype.clase.Reteta;

public class Program {
    public static void main(String[] args) {
        Reteta reteta1 = new Reteta("Aspirina", "Acid acetilsalicilic 500mg", 500.0);
        System.out.println("Original: " + reteta1);


        Reteta reteta2 = reteta1.clone();
        reteta2.setDenumire("Aspirina Junior");
        reteta2.setCantitate(250.0);
        System.out.println("Clona modificata: " + reteta2);


        System.out.println("Original: " + reteta1);
    }
}

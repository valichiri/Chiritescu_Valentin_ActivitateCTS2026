package dp.observer.clase;

public interface ISubiect {
    void aboneaza(IObserver observer);
    void dezaboneaza(IObserver observer);
    void notificaToti(String mesaj);
}
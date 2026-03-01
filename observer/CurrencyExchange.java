import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject {

    private List<IObserver> observers = new ArrayList<>();

    private String currency;
    private double rate;

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String currency, double rate) {
        for (IObserver observer : observers) {
            observer.update(currency, rate);
        }
    }

    
    public void setRate(String currency, double rate) {
        this.currency = currency;
        this.rate = rate;
        notifyObservers(currency, rate);
    }
}
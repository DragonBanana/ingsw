package lab7.ex3;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractStock {

    private List<StockObserver> observers;

    public abstract double getPrice();

    public abstract void setPrice(double price);

    public AbstractStock() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(StockObserver observer) {
        this.observers.add(observer);
    }

    public void removeObserver(StockObserver observer) {
        this.observers.remove(observer);
    }

    public void notifyObservers() {
        for(StockObserver observer: this.observers) {
            observer.update(this);
        }
    }

}

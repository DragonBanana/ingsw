package lab7.ex3;

public class Stock extends AbstractStock{

    public String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        this.notifyObservers();
    }

    @Override
    public String toString() {
        return "Symbol: " + symbol +
                ", price: " + price;
    }
}

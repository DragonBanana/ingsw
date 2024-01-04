package lab5.ex9;

import java.util.ArrayList;
import java.util.List;

// Client: StockMonitoringApp
public class StockMonitoringApp {
    public static void main(String[] args) {
        // Create a StockMarket
        StockMarket stockMarket = new StockMarket();

        // Create and register observers
        StockObserver observer1 = new ConsoleStockObserver("Observer 1");
        StockObserver observer2 = new ConsoleStockObserver("Observer 2");

        stockMarket.addObserver(observer1);
        stockMarket.addObserver(observer2);

        // Create stocks
        Stock appleStock = new Stock("AAPL", 150.0, stockMarket);
        Stock googleStock = new Stock("GOOGL", 2500.0, stockMarket);

        // Simulate stock price changes
        stockMarket.simulateStockPriceChanges();
    }
}
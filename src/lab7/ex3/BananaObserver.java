package lab7.ex3;

public class BananaObserver extends StockObserver {

    private double prevPrice;

    @Override
    public void update(AbstractStock stock) {
        if(prevPrice > stock.getPrice()) {
            System.out.println("Banana is buying this stock: " + stock);
        }
        this.prevPrice = stock.getPrice();
    }
}

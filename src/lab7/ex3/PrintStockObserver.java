package lab7.ex3;

public class PrintStockObserver extends StockObserver{

    @Override
    public void update(AbstractStock stock) {
        System.out.println(stock);
    }
}

package lab7.ex3;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Stock polimi = new
                Stock("POLIMI", 100);

        Stock banana = new
                Stock("BANANA", 50);

        StockObserver pso = new PrintStockObserver();
        StockObserver bo = new BananaObserver();
        polimi.addObserver(pso);
        polimi.addObserver(bo);

        polimi.setPrice(150);

        banana.addObserver(pso);

        for(int i = 0; i < 10; i ++) {
            double priceChange = Math.random() * 10 - 20;
            polimi.setPrice(polimi.getPrice() + priceChange);
            banana.setPrice(banana.getPrice() + priceChange);
            Thread.sleep(1000);
        }


    }
}

package lab5.ex4;

public class Camper implements Runnable {

    public Pot pot;
    public String name;

    public Camper(Pot pot, String name) {
        this.pot = pot;
        this.name = name;
    }

    public void run() {
        while(true) {
            pot.getPart(this);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

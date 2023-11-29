package lab5.ex4;

public class Chef implements Runnable {

    public Pot pot;

    public Chef(Pot pot) {
        this.pot = pot;
    }

    @Override
    public void run() {
        while (true) {
            pot.fill(2);
        }
    }
}

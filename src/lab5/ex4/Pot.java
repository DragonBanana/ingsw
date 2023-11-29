package lab5.ex4;

public class Pot {

    private int parts;

    public void getPart(Camper camper) {
        synchronized (this) {
            while (parts == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

            System.out.println("Camper " + camper.name + " get one part");
            this.parts--;

            if (parts == 0) {
                notifyAll();
            }
        }
    }

    public synchronized void fill(int amount) {
        while(parts > 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Chef filled " + amount + " parts");
        this.parts += amount;

        notifyAll();
    }

    public static void main(String[] args) {
        Pot pot = new Pot();
        Chef chef = new Chef(pot);
        Camper c1 = new Camper(pot, "1");
        Camper c2 = new Camper(pot, "2");
        Camper c3 = new Camper(pot, "3");
        Camper c4 = new Camper(pot, "4");

        new Thread(chef).start();
        new Thread(c1).start();
        new Thread(c2).start();
        new Thread(c3).start();
        new Thread(c4).start();
    }
}

package lab5.ex3;

public class Producer implements Runnable{

    public Account account;

    public Producer(Account account) {
        this.account = account;
    }


    @Override
    public void run() {
        while(true) {
            int amount = (int) (Math.random() * 200);
            synchronized (account) {
                account.deposit(amount);
            }
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

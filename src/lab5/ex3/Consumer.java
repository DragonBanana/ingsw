package lab5.ex3;

public class Consumer implements Runnable {

    public Account account;
    public int max;
    public int wait;

    public Consumer(Account account, int max, int wait) {
        this.account = account;
        this.max = max;
        this.wait = wait;
    }

    @Override
    public void run() {
        while(true) {
            int amount = (int) (Math.random() * max);
            synchronized(account) {
                if (amount < account.balance) {
                    account.withdraw(amount);
                }
            }

            try {
                Thread.sleep(this.wait);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

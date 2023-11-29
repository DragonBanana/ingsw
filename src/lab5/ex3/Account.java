package lab5.ex3;

public class Account {

    public int balance;

    public synchronized void deposit(int amount) {
        System.out.println("DEPOSITING " + amount + " BALANCE " + balance);
        this.balance += amount;
    }

    public synchronized void withdraw(int amount) {
        System.out.println("WITHDRAWING " + amount + " BALANCE " + balance);
        this.balance -= amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        Producer p = new Producer(account);
        Consumer c1 = new Consumer(account, 300, 1000);
        Consumer c2 = new Consumer(account, 200, 3000);
        new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }

}

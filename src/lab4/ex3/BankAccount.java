package lab4.ex3;

public class BankAccount {

    private int id;
    private double balance;

    public BankAccount(int id) {
        this.id = id;
        this.balance = 0;
    }

    public void withdraw(double amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        }
        if (amount > balance) {
            throw new InsufficientFundsException(amount, balance);
        }
        this.balance -= amount;
    }

    public void deposit(double amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException(amount);
        }
        this.balance += amount;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount(0);
        BankAccount account2 = new BankAccount(0);
        double account2Balance = account2.balance;
        try {
            account2.deposit(100);
            account.withdraw(100);
        } catch (Exception e) {
            System.out.println(e);
//        } catch(InsufficientFundsException e) {
//            System.out.println(e);
//        } catch(NegativeAmountException e) {
//            System.out.println(e);
        } finally {
            if(account.balance + account2Balance != 0) {
                account2.balance = account2Balance;
            }
        }
    }

}

package lab4.ex3;

public class InsufficientFundsException extends Exception{

    private String message;
    private double amount;
    private double balance;

    public InsufficientFundsException(double amount, double balance) {
        this.amount = amount;
        this.balance = balance;
        this.message = "Impossible to withdraw from balance: " +
                "" + balance + " an amount: " + amount;
    }

    public String getMessage() {
        return this.message;
    }

}

package lab4.ex3;

public class NegativeAmountException extends Exception{

    public String message = "Negative amount as parameter: ";
    public double negativeAmount;

    public NegativeAmountException(double negativeAmount) {
        this.negativeAmount = negativeAmount;
    }

    public String getMessage() {
        return message + negativeAmount;
    }

}

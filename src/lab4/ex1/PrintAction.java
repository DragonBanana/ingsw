package lab4.ex1;

public class PrintAction implements Action{

    private String message;

    public PrintAction(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
        System.out.println(message);
    }
}

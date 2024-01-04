package ex10;

// Observer Pattern: SimpleGameObserver
public class SimpleGameObserver implements TicTacToeGameObserver {
    @Override
    public void update(String message) {
        // Example: Process updates received from the server
        System.out.println("Received update: " + message);
    }
}
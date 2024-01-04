package ex10;

import java.io.IOException;

// Main Class
public class ClientMain {
    public static void main(String[] args) {
        try {
            TicTacToeClient client = new TicTacToeClient("localhost", 5000, new SimpleGameObserver());

            // Example: Start listening for updates from the server
            new Thread(client::startListening).start();

            Player player = new HumanPlayer('O', client);
            while(true) {
                player.makeMove();
            }
            // Example: Close the client
//            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package ex10;

import java.io.IOException;

// Main Class
public class ServerMain {
    public static void main(String[] args) {
        // Example: Start the server
        TicTacToeServer server = new TicTacToeServer();
        server.start(5000);
    }
}
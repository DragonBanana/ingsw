package ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// Observer Pattern: TCP Client
public class TicTacToeClient {
    private final Socket socket;
    private final BufferedReader in;
    private final PrintWriter out;
    private final TicTacToeGameObserver observer;

    public TicTacToeClient(String serverAddress, int port, TicTacToeGameObserver observer) throws IOException {
        this.observer = observer;
        socket = new Socket(serverAddress, port);
        in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        out = new PrintWriter(socket.getOutputStream(), true);
    }

    public void startListening() {
        try {
            while (true) {
                String message = in.readLine();
                observer.update(message);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    public void close() throws IOException {
        socket.close();
        in.close();
        out.close();
    }

    public static void main(String[] args) {
        try {
            // Example: Create a client with a simple observer
            TicTacToeClient client = new TicTacToeClient("localhost", 5000, new SimpleGameObserver());

            // Example: Start listening for updates from the server
            client.startListening();

            // Example: Send a message to the server
            client.sendMessage("MOVE 1 1");

            // Example: Close the client
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
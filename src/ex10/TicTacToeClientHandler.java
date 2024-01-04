package ex10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

// TCP Client Handler
public class TicTacToeClientHandler implements Runnable {
    private final Socket clientSocket;
    private final TicTacToeServer server;
    private final BufferedReader in;
    private final PrintWriter out;

    public TicTacToeClientHandler(Socket clientSocket, TicTacToeServer server) throws IOException {
        this.clientSocket = clientSocket;
        this.server = server;
        this.in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
        this.out = new PrintWriter(clientSocket.getOutputStream(), true);
    }

    @Override
    public void run() {
        // Example: Register the client as an observer
        server.registerClient(this);

        try {
            while (true) {
                String message = in.readLine();
                if (message != null) {
                    // Example: Process the received message
                    processMessage(message);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Example: Unregister the client when it disconnects
            server.unregisterClient(this);
            try {
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public void sendMessage(String message) {
        out.println(message);
    }

    private void processMessage(String message) {
        // Example: Process the received message (e.g., handle player moves)
        // You may need to implement more logic based on the game requirements
        System.out.println("Received message: " + message);
        // Notify other clients about the message
        server.notifyClients(message);
    }
}
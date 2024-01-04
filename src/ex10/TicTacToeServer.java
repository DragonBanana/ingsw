package ex10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

// Observer Pattern: TCP Server
public class TicTacToeServer {
    private final List<TicTacToeClientHandler> clients = new ArrayList<>();

    public synchronized void registerClient(TicTacToeClientHandler client) {
        clients.add(client);
    }

    public synchronized void unregisterClient(TicTacToeClientHandler client) {
        clients.remove(client);
    }

    public synchronized void notifyClients(String message) {
        for (TicTacToeClientHandler client : clients) {
            client.sendMessage(message);
        }
    }

    public static void main(String[] args) {
        TicTacToeServer server = new TicTacToeServer();
        server.start(5000);
    }

    public void start(int port) {
        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server started. Waiting for clients...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected: " + clientSocket);

                // Create a new client handler for each connected client
                TicTacToeClientHandler clientHandler = new TicTacToeClientHandler(clientSocket, this);
                clients.add(clientHandler);
                new Thread(clientHandler).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
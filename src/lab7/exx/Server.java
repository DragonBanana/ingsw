package lab7.exx;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(12345);
            Game game = new Game();
            while(true) {
                Socket clientSocket = serverSocket.accept();
                new Thread(new ClientHandler(clientSocket, game)).start();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

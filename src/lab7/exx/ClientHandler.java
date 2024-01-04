package lab7.exx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ClientHandler implements Runnable {

    private Socket clientSocket;
    private PrintWriter out;
    private BufferedReader in;
    private Game game;
    private Player player;

    public ClientHandler(Socket socket, Game game) {
        this.clientSocket = socket;
        try {
            this.out = new PrintWriter(socket.getOutputStream());
            this.in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
            this.game = game;
            if(this.game.isCirclePlayerTurn()) {
                this.player = this.game.getCirclePlayer();
            } else {
                this.player = this.game.getCrossPlayer();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {

    }

//    public void handleInput(String input) {
//        if(input.startsWith("login:")) {
//            // gestione del messaggio login
//            String username = input.split(":")[1];
//            this.username = username;
//            out.println("Ciao " + username);
//            out.flush();
//        } else if (input.startsWith("text:")) {
//            // gestione del messaggio text
//            String text = input.split(":")[1];
//            out.println("Response: " + text);
//            out.flush();
//        } else if (input.startsWith("reverse:")) {
//            // gestione del message reverse
//            String text = input.split(":")[1];
//            out.println(new StringBuilder(text).reverse().toString());
//            out.flush();
//        } else if (input.startsWith("exit:")) {
//            // gestione del messaggio exit
//            out.println("Addio " + username);
//            out.close();
//            try {
//                in.close();
//                clientSocket.close();
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//    }

//    @Override
//    public void run() {
//        while(true) {
//            try {
//                String input = in.readLine();
//                if(input != null) {
//                    System.out.println(input);
//                    this.handleInput(input);
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

}

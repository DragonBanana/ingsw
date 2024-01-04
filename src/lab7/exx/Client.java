package lab7.exx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 12345);
            PrintWriter out = new PrintWriter(socket.getOutputStream());
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );
//            Scanner scanner = new Scanner(System.in);
//
//            while(true) {
//                System.out.println("Enter message (type 'exit' to quit) : ");
//                String message = scanner.nextLine();
//                out.println(message);
//                out.flush();
//                if(message.equals("exit")) {
//                    out.close();
//                    in.close();
//                    socket.close();
//                    break;
//                }
//                String response = in.readLine();
//                System.out.println("From server: " + response);
//            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


}

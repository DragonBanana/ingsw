package lab6.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {

        Buffer[] bufferArray = new Buffer[4];
        for (int i = 0; i < 4; i++) {
            bufferArray[i] = new Buffer(i);
        }

        // Process Input
        new Thread(new Runnable() {
            @Override
            public void run() {
                BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
                while (true) {
                    System.out.println("Inserisci una coppia posizione e carattere:");
                    try {
                        String input = b.readLine();
                        String[] splittedInput = input.split(" ");
                        int i = Integer.parseInt(splittedInput[0]);
                        char ch = splittedInput[1].charAt(0);
                        bufferArray[i].write(ch);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {

            String result = "";
            @Override
            public void run() {
                while (true) {
                    for (int i = 0; i < 4; i++) {
                        char ch = bufferArray[i].read();
                        result = result + "<" + i + "," + ch + "> ";
                        System.out.println("PO: " + result);
                    }
                }
            }
        }).start();

    }

}

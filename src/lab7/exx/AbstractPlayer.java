package lab7.exx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class AbstractPlayer implements Player {

    public int[] askMove(Board board) throws IllegalMoveException {
        int result[] = new int[2];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Inserisci x: ");
            int x = Integer.parseInt(reader.readLine());
            System.out.println("Inserisci y: ");
            int y = Integer.parseInt(reader.readLine());
            result[0] = x;
            result[1] = y;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

}

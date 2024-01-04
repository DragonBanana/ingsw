package lab7.exx;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CirclePlayer extends AbstractPlayer {

    @Override
    public void makeMove(Board board, int x, int y) throws IllegalMoveException {
        board.placeCircle(x, y);
    }

}

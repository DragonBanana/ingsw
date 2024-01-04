package lab7.exx;

public class CrossPlayer extends AbstractPlayer {

    @Override
    public void makeMove(Board board, int x, int y) throws IllegalMoveException {
        board.placeCross(x, y);
    }
}

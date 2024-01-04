package lab7.exx;

public interface Player {

    public void makeMove(Board board, int x, int y) throws IllegalMoveException ;
    public int[] askMove(Board board) throws IllegalMoveException;
}

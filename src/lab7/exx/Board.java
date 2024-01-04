package lab7.exx;

public class Board {

    private Cell[][] board = new Cell[3][3];

    public Board() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = new EmptyCell();
            }
        }
    }

    public void placeCross(int x, int y) throws IllegalMoveException {
        if (board[x][y].isEmpty()) {
            board[x][y] = new CrossCell();
        } else {
            throw new IllegalMoveException();
        }
    }

    public void placeCircle(int x, int y) throws IllegalMoveException {
        if (board[x][y].isEmpty()) {
            board[x][y] = new CircleCell();
        } else {
            throw new IllegalMoveException();
        }
    }

    public boolean checkWin() {
        return checkRowWin() || checkColWin() || checkDiagWin();
    }

    private boolean checkRowWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0].equals(board[i][1]) &&
                    board[i][0].equals(board[i][2]) &&
                    !board[i][0].isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private boolean checkColWin() {
        for (int j = 0; j < 3; j++) {
            if (board[0][j].equals(board[1][j]) &&
                    board[0][j].equals(board[2][j]) &&
                    !board[0][j].isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiagWin() {
        if (board[0][0].equals(board[1][1]) &&
                board[0][0].equals(board[2][2]) &&
                !board[0][0].isEmpty()) {
            return true;
        }
        if (board[0][2].equals(board[1][1]) &&
                board[0][2].equals(board[2][0]) &&
                !board[0][2].isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                result += board[i][j].toString() + " ";
            }
            result += "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.checkWin());

        try {
            board.placeCircle(0, 0);
            board.placeCircle(0, 1);
            board.placeCircle(0, 2);
        } catch (IllegalMoveException e) {
            throw new RuntimeException(e);
        }
        System.out.println(board.checkWin());
    }

}

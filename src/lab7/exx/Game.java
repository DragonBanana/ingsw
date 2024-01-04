package lab7.exx;

public class Game {

    private Board board;
    private Player circlePlayer;
    private Player crossPlayer;
    private boolean isCirclePlayerTurn;

    public Game() {
        this.board = new Board();
        this.circlePlayer = new CirclePlayer();
        this.crossPlayer = new CrossPlayer();
        this.isCirclePlayerTurn = false;
    }

    public Board getBoard() {
        return board;
    }

    public Player getCirclePlayer() {
        return circlePlayer;
    }

    public Player getCrossPlayer() {
        return crossPlayer;
    }

    public boolean isCirclePlayerTurn() {
        return isCirclePlayerTurn;
    }

    public Player getPlayerTurn() {
        if(this.isCirclePlayerTurn) {
            return circlePlayer;
        }
        return crossPlayer;
    }

    public void makeMove(int x, int y) throws IllegalMoveException {
        Player player = getPlayerTurn();
        player.makeMove(board, x, y);
        isCirclePlayerTurn = !isCirclePlayerTurn;
        System.out.println(board.toString());
    }

    public static void main(String[] args) {
        Game game = new Game();
        try {
            for(int i=0; i<9; i++) {
                int[] result = game.getPlayerTurn().askMove(game.board);
                game.makeMove(result[0], result[1]);
                if(game.board.checkWin()) {
                    System.out.println("HAI VINTO!");
                    break;
                }
            }
        } catch (IllegalMoveException e) {
            throw new RuntimeException(e);
        }
    }

}

package ex10;

// Strategy Pattern: GameLogic
public interface GameLogic {
    boolean checkWin(char[][] grid, char symbol);

    boolean checkDraw(char[][] grid);
}
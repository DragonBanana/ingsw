package ex10;

// Strategy Pattern: SimpleGameLogic
public class SimpleGameLogic implements GameLogic {
    @Override
    public boolean checkWin(char[][] grid, char symbol) {
        // Implement simple win-checking logic
        // Check rows, columns, and diagonals for a winning combination
        return false;
    }

    @Override
    public boolean checkDraw(char[][] grid) {
        // Implement simple draw-checking logic
        // Check if the board is full without a winner
        return false;
    }
}
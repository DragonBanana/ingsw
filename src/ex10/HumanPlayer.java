package ex10;

import java.util.Scanner;

// Factory Method Pattern: HumanPlayer
public class HumanPlayer extends Player {
    private final Scanner scanner = new Scanner(System.in);
    private TicTacToeClient client;

    public HumanPlayer(char symbol, TicTacToeClient client) {
        super(symbol);
        this.client = client;
    }

    @Override
    public void makeMove() {
        int row, col;

        while (true) {
            try {
                System.out.println("Enter the row (0, 1, or 2): ");
                row = scanner.nextInt();

                System.out.println("Enter the column (0, 1, or 2): ");
                col = scanner.nextInt();

                client.sendMessage("MOVE " + row + " " + col);

                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter valid integers for row and column.");
                scanner.nextLine(); // Consume the invalid input
            }
        }

        // Update the game board with the move
        // Assuming there is a method like makeMove(row, col) in the game board
        // You need to adapt this part based on your actual implementation
        GameBoard.getInstance().makeMove(row, col, symbol);
    }
}
import java.util.*;

/**
 * The TicTacToe class serves as the entry point for the game.
 * It handles player input, displays instructions, and starts the game session.
 */
public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Display welcome message and game instructions
        System.out.println("=======================================");
        System.out.println("         Welcome to Tic Tac Toe!        ");
        System.out.println("=======================================");
        System.out.println("How to Play:");
        System.out.println("1.  The game is played on a 3x3 grid.");
        System.out.println("2.  Player 1 uses 'X' and Player 2 uses 'O'.");
        System.out.println("3.  Players take turns entering row and column numbers (0, 1, or 2).");
        System.out.println("4.  The first player to get three marks in a row, column, or diagonal wins!");
        System.out.println("5.  If all cells are filled with no winner, it's a draw.");
        System.out.println("---------------------------------------");

        // Get player names
        System.out.print("Enter Player 1 name: ");
        String player1 = sc.nextLine();
        System.out.print("Enter Player 2 name: ");
        String player2 = sc.nextLine();

        // Create and start a new game
        Game game = new Game(player1, player2);
        System.out.println("Game started between " + player1 + " and " + player2 + "!");
        game.initializeBoard();
        game.playGame();

        sc.close();
    }
}

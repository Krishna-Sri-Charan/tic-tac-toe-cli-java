import java.util.*;

/**
 * The Game class manages the logic and state of a Tic Tac Toe game.
 * It handles the board, player turns, move validation, and win/tie conditions.
 */
public class Game {
    private char[][] board;         // The 3x3 game board
    private String player1, player2; // Names of both players
    private char currentPlayerMark;  // 'X' for Player 1, 'O' for Player 2
    private Scanner sc;

    // Constructor to initialize the game with player names
    public Game(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        this.board = new char[3][3];
        this.currentPlayerMark = 'X';
        this.sc = new Scanner(System.in);
    }

    // Initialize or reset the game board
    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            Arrays.fill(board[i], '.');
        }
    }

    // Print the current state of the board
    public void printBoard() {
        System.out.println("Current board:");
        System.out.println("    0   1   2   ");
        System.out.println("  +---+---+---+");
        for (int i = 0; i < 3; i++) {
            System.out.print(i + " | ");
            for (int j = 0; j < 3; j++) {
                System.out.print((board[i][j] == '.' ? " " : board[i][j]) + " | ");
            }
            System.out.println();
            System.out.println("  +---+---+---+");
        }
    }

    // Check if the board is full (tie condition)
    public boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == '.') return false;
            }
        }
        return true;
    }

    // Check for a win condition
    public boolean checkForWin() {
        return (checkRowsForWin() || checkColumnsForWin() || checkDiagonalsForWin());
    }

    // Helper: check all rows for a win
    private boolean checkRowsForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == currentPlayerMark &&
                board[i][1] == currentPlayerMark &&
                board[i][2] == currentPlayerMark) {
                return true;
            }
        }
        return false;
    }

    // Helper: check all columns for a win
    private boolean checkColumnsForWin() {
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == currentPlayerMark &&
                board[1][i] == currentPlayerMark &&
                board[2][i] == currentPlayerMark) {
                return true;
            }
        }
        return false;
    }

    // Helper: check both diagonals for a win
    private boolean checkDiagonalsForWin() {
        return ((board[0][0] == currentPlayerMark && board[1][1] == currentPlayerMark && board[2][2] == currentPlayerMark) ||
                (board[0][2] == currentPlayerMark && board[1][1] == currentPlayerMark && board[2][0] == currentPlayerMark));
    }

    // Switch to the other player
    public void changePlayer() {
        currentPlayerMark = (currentPlayerMark == 'X') ? 'O' : 'X';
    }

    // Reset the game to play again
    public void resetGame() {
        initializeBoard();
        currentPlayerMark = 'X';
        playGame();
    }

    // Main game loop
    public void playGame() {
        boolean gameWon = false;
        printBoard();

        while (!gameWon && !isBoardFull()) {
            String currentPlayer = (currentPlayerMark == 'X') ? player1 : player2;
            System.out.println(currentPlayer + "'s turn (" + currentPlayerMark + "). Enter row and column (0, 1, or 2): ");

            int row = sc.nextInt();
            int col = sc.nextInt();

            if (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == '.') {
                board[row][col] = currentPlayerMark;
                printBoard();

                if (checkForWin()) {
                    System.out.println(currentPlayer + " wins!");
                    gameWon = true;
                } else if (isBoardFull()) {
                    System.out.println("The game is a tie!");
                } else {
                    changePlayer();
                }
            } else {
                System.out.println("Invalid move. Please try again.");
            }
        }

        // Ask players if they want to play again
        System.out.print("Do you want to play again? (Y/N): ");
        String response = sc.next();
        if (response.equalsIgnoreCase("Y")) {
            resetGame();
        } else {
            System.out.println("Thanks for playing Tic Tac Toe!");
        }
        sc.close();
    }
}

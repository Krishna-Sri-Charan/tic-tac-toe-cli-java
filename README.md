# 🎮 tic-tac-toe-cli-java

A simple command-line Tic Tac Toe game built in Java. This project demonstrates basic object-oriented programming (OOP), game logic implementation, and user interaction through a terminal interface.

---

## 🔄 Getting Started

You can download the project as a ZIP or clone it using Git:

```bash
git clone https://github.com/your-username/tic-tac-toe-cli-java.git
cd tic-tac-toe-cli-java
```
---

## 📘 Description

This project allows two players to play Tic Tac Toe from the command line. Players take turns entering the row and column of their moves, and the game checks for win/tie conditions after each move.

Key features include:

- Turn-based 2-player gameplay (Player 1: `X`, Player 2: `O`)
- Clear instructions and input prompts
- Win and draw detection logic
- Option to replay after a game ends
- Clean board display using ASCII characters
- Built entirely with Java using OOP principles

---

## ⚙️ Setup & Run Instructions

### 🛠 Requirements

- Java Development Kit (JDK) 8 or later
- Terminal or command prompt


### ▶️ How to Compile & Run

Open a terminal in the project directory and run:

```bash
javac Game.java TicTacToe.java
java TicTacToe
```

---

## 📋 Example Game Play

```plaintext
=======================================
         Welcome to Tic Tac Toe!        
=======================================
How to Play:
1.  The game is played on a 3x3 grid.
2.  Player 1 uses 'X' and Player 2 uses 'O'.
3.  Players take turns entering row and column numbers (0, 1, or 2).
4.  The first player to get three marks in a row, column, or diagonal wins!
5.  If all cells are filled with no winner, it's a draw.
---------------------------------------
Enter Player 1 name: Charan
Enter Player 2 name: Krishna
Game started between Charan and Krishna!
Current board:
    0   1   2
  +---+---+---+
0 |   |   |   |
  +---+---+---+
1 |   |   |   |
  +---+---+---+
2 |   |   |   |
  +---+---+---+
Charan's turn (X). Enter row and column (0, 1, or 2):
1 1
Current board:
    0   1   2
  +---+---+---+
0 |   |   |   |
  +---+---+---+
1 |   | X |   |
  +---+---+---+
2 |   |   |   |
  +---+---+---+
Krishna's turn (O). Enter row and column (0, 1, or 2):
0 1
Current board:
    0   1   2
  +---+---+---+
0 |   | O |   |
  +---+---+---+
1 |   | X |   |
  +---+---+---+
2 |   |   |   |
  +---+---+---+
Charan's turn (X). Enter row and column (0, 1, or 2):
0 0
Current board:
    0   1   2
  +---+---+---+
0 | X | O |   |
  +---+---+---+
1 |   | X |   |
  +---+---+---+
2 |   |   |   |
  +---+---+---+
Krishna's turn (O). Enter row and column (0, 1, or 2):
1 2
Current board:
    0   1   2
  +---+---+---+
0 | X | O |   |
  +---+---+---+
1 |   | X | O |
  +---+---+---+
2 |   |   |   |
  +---+---+---+
Charan's turn (X). Enter row and column (0, 1, or 2):
2 2
Current board:
    0   1   2
  +---+---+---+
0 | X | O |   |
  +---+---+---+
1 |   | X | O |
  +---+---+---+
2 |   |   | X |
  +---+---+---+
Charan wins!
Do you want to play again? (Y/N): n
Thanks for playing Tic Tac Toe!
```

---

## 🧩 Project Structure

```plaintext
tic-tac-toe-cli-java/
├── Game.java          # Core game logic
├── TicTacToe.java     # Entry point of the app
├── .gitignore         # Ignore rules for Git
└── README.md          # Project documentation
```
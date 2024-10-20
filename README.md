# Rock Paper Scissors Game in Java

This project is a simple console-based **Rock, Paper, Scissors** game built in Java. It allows a user to play against the computer. The computer randomly chooses between rock, paper, or scissors, and the game then determines the winner based on the standard rules of the game.

## Features
- User can input their move (rock, paper, or scissor).
- The computer generates a random move.
- The game compares the user's move with the computer's move and prints the result.
- If the user enters an invalid move, the game declares a win for the computer.
- Displays both the user’s and the computer's moves.

## How It Works
1. The user is prompted to enter their move (`rock`, `paper`, or `scissor`).
2. The computer randomly selects a move from the three options.
3. The program compares both moves and announces the winner based on the following rules:
   - Rock beats Scissors.
   - Scissors beats Paper.
   - Paper beats Rock.
   - If both the user and the computer choose the same move, the game is a tie.
4. If the user enters an invalid input, the program outputs "You let computer win" and defaults the result.

## Example
```
Please type your move: rock
It's a Tie
The user move is: rock
The computer move is: rock
```

## Code Structure

- **Main Class**: `RPSGame`
  - **Methods**:
    - `userChoice()`: Gets the user's input and converts it to an integer representing the move (0 = rock, 1 = paper, 2 = scissor). Returns `-1` for invalid input.
    - `computerChoice()`: Generates a random number between 0 and 2, representing the computer's move.
    - `result(int userMove, int computerMove)`: Compares the user's move and the computer's move, returning a string indicating whether the user won, the computer won, or if it's a tie.
    - `moveToString(int move)`: Converts the integer move back to its corresponding string form (rock, paper, scissor).

## Installation & Usage

1. **Clone the Repository**:
   ```
   git clone https://github.com/essajamal/RockPaperScissorsJava.git
   ```

2. **Navigate to the Project Directory**:
   ```
   cd RockPaperScissorsJava
   ```

3. **Compile and Run**:
   ```
   javac RPSGame.java
   java RPSGame
   ```

4. **Play the Game**:
   - Type `rock`, `paper`, or `scissor` when prompted.

## Possible Improvements
- Add a graphical interface (GUI) for a more user-friendly experience.
- Add the ability to play multiple rounds and keep score.
- Implement error handling to prevent the game from continuing if the user enters invalid input.

## License
This project is licensed under the MIT License.

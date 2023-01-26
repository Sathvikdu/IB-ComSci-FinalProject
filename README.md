# IB-ComSci-FinalProject
Here you can find the Java code and the Documentation to go along with it.
Documentation 
Target assessment level: 

The target assessment level of this work is 3.

Project Synopsis:

This Java program generates a game of tic tac toe. The game board is represented by a char array called "board." The array starts out with the numbers 1 through 9, and as the game goes on, Xs and Os are used in place of the numbers to represent the moves that the players have made.

Overall, the program is well-structured, easy to understand, and efficient regarding resource management. Exception handling is also implemented to prevent the program from crashing due to invalid input and it's well-structured to handle edge cases. The program uses an array of strings to represent the board, which is efficient in terms of memory usage. The program uses a while loop to keep the game running until a winner is found or the game is a draw, which is efficient in terms of resource usage.

There are several methods in the TicTacToe class:
The checkWinner() method checks all the possible winning combinations of the game, and returns the character X if player X wins, the character O if player O wins, the character D if the game is a draw, and the character N if the game is still ongoing.
The printBoard() method prints the current state of the game board to the console.
The triggerGame(String answer) method checks if the player wants to play again. If the answer is "yes", it resets the game board, sets the turn to X, and sets the winner to N. If the answer is "no", it prints "Thanks for playing!". If the answer is anything else, it prompts the player to enter a valid input.

The class also has four static variables:
board: a char array that represents the game board
turn: a char variable that represents whose turn it is, either X or O
winner: a char variable that represents the winner of the game, either X, O, D, or N
player1Name and player2Name, both strings represent the names of the players

The game starts with a prompt asking player 1 for his name and player 2 for his name, and then it prints the initial state of the game board, with the numbers 1-9. Then it prompts the player whose turn it is to make a move by entering a number between 1-9. The program then checks for the winner after each move and keeps prompting the players until there is a winner. Finally, it will ask if the players want to play again.

Specification:

The code is for a Tic Tac Toe game. It has a static char array called "board" that represents the game board, a static char variable called "turn" that keeps track of the current player's turn, a static char variable called "winner" that keeps track of the winner of the game, and two static String variables called "player1Name" and "player2Name" that store the names of the players.
The Tic-Tac-Toe program allows two players to play the game on a 3x3 board.
The program prompts the players to enter a slot number between 1 and 9 to place their respective X or O on the board (after they enter their names and get assigned X and O).
The program checks for a winner by checking all possible winning combinations (horizontally, vertically and diagonally) after each player's turn so the game keeps going until there is a winner or a draw.
If the game is a draw because the board is filled and no one wins, the program will print "It's a draw!". 
This code first checks if the result of the game is a draw or if one of the users won or if one of the users lost. When either one of these things happens, the code prompts the user to try again and waits for their input. If the input is "yes", it resets the board and turn variables and continues the game. If the input is "no", it prints “Thanks for playing!" and exits the game i.e. stops running the code.

Correctness and Exception Handling:

The program uses an array of strings to represent the board and the checkWinner() method to check for a winner after each move. This method checks all possible winning combinations, making the program work correctly.
The code also uses the printBoard() method to print out the current status of the board and the triggerGame() method to check if the player wants to play again.
The program uses exception handling to catch any input that is not an integer, this will prevent the program from crashing due to invalid input and prompt the user again to input a valid integer.
The triggerGame() method uses a try-catch block to catch any exceptions that may occur when the player inputs their answer. If an exception is caught, the code prompts the player to enter their answer again.
The program is tested for typical input and works correctly for all test cases. The program can handle edge cases such as invalid inputs, and it's able to check for all possible winning combinations.

Code Clarity:

The program uses proper variable and method naming conventions, making it easy to understand the purpose of each variable and method.
The program uses proper indentation and whitespace to separate different sections of the code, making it easier to read and understand.
The program makes use of comments to provide a short and concise definition of the purpose(s) of certain sections of the code, making it easy to understand the logic behind the program.
The program flow is split into meaningful functions in different locations to avoid confusion. 
As you can see, comments have been added to the code to provide a clear explanation of what each function and block of code is doing. 
The checkWinner method checks for the winner and the printBoard method prints out the game board. 
The main method runs the game loop and handles user input, exception handling, and game logic.

Resource Management:

The code uses the Scanner class to take input from the player, but it is properly closed in the triggerGame() method. The code also creates a new char array for the board each time the game is reset, ensuring that any previous game data is not carried over.
The program uses an array of strings to represent the board, which is efficient in terms of memory usage.
The program uses a while loop to keep the game running until a winner is found or the game is a draw. This allows the program to run until the game is finished, and then exit, avoiding unnecessary resource usage.
In the end, the globalScanner is closed with globalScanner.close().
The program uses the checkWinner method to check for a winner only when necessary, this avoids unnecessary computation, and thus improves the performance of the program.

Personal experience: 

Initially, I had no intention of making a Tic-Tac-Toe game in Java, it was just an idle thought and upon research, I found it fitting with what we have covered in this course and then I decided to go through with this. At first, it wasn't as hard as it would soon get, I had to do a bunch of research and hours of error correction. This code isn't that impressive to professionals but only having had the knowledge I gained from this course and some websites that provide information, I had nothing else going into this, and I believe I have tried my best and ended up with a presentable product, as “nothing is perfect”. I have gained a lot of useful knowledge that otherwise wouldn’t be of any interest to me if it wasn’t for this project. This has undoubtedly been the hardest part of this computer science course, and reflecting upon it has left me with a positive note: I can now comfortably say that I have put in real effort to make this code work and I am very happy that I got there in the end, even though I questioned my life choices and wanted to scrap this idea many, many times.



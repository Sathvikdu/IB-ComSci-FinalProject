import java.util.*;

class TicTacToe
{
    // char array to keep track of the game board
    static char[] board;

    // variable to keep track of the current turn
    static char turn;

    // variable to keep track of the winner
    static char winner;

    // variable to store player1's name
    static String player1Name;

    // variable to store player2's name
    static String player2Name;

    // Scanner object to read input from the user
    static Scanner globalScanner;

    //checkWinner method will decide the combination of three box given below.

    // It will check all the possible winning combination of the game.

    // returns X if X wins, O if O wins, D if the game is draw, N if the game continues.

    static char checkWinner()
    {
        for (int a = 0; a < 8; a++)
        {
            String line = null;

            switch (a)
            {
                case 0:
                    line = "" + board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = "" + board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = "" + board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = "" + board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = "" + board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = "" + board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = "" + board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = "" + board[2] + board[4] + board[6];
                    break;
            }
            if (line.equals("XXX"))
            {
                return 'X';
            } else if (line.equals("OOO"))
            {
                return 'O';
            }
        }
        // check if the game is a draw
        for (int a = 0; a < 9; a++)
        {
            if (board[a] != 'X' && board[a] != 'O')
            {
                break;
            } else if (a == 8)
            {
                return 'D';
            }
        }
        // if the game is ongoing, print the current turn and prompt the user for input
        System.out.println(turn + "'s turn; enter a slot number (1-9) to place " + turn + " in:");
        return 'N';
    }

    // printBoard method will print out the current status of the board
    static void printBoard()
    {
        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
        System.out.println("|---|---|---|");
        System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
        System.out.println("|---|---|---|");
    }

    // check if the player wants to play again
    static void triggerGame(String answer)
    {
        try
        {
            if (answer.equals("yes"))
            {
                // reset the board, turn, and winner
                board = new char[9];
                turn = 'X';
                winner = 'N';
                System.out.println("The board has been reset.");
                System.out.println("Welcome back to 3x3 Tic Tac Toe!");

                // initialize the board
                for (int a = 0; a < 9; a++)
                {
                    board[a] = (char) (a + '1');
                }
                printBoard();
                System.out.println(player1Name + "'s turn; enter a slot number (1-9) to place X in:");
            } else if (answer.equals("no"))
            {
                // end the game
                System.out.println("The game has ended. Thanks for playing!");
            } else
            {
                // prompt the user for a valid input
                System.out.println("Invalid input, please type either yes or no");
                String newAnswer = globalScanner.nextLine().toLowerCase();
                triggerGame(newAnswer);
            }

        } catch (Exception es)
        {
            //catch exception that might occur
            System.out.println("Exception in triggerGame" + es.getMessage());
        }
    }

    public static void main(String[] args)
    {
        globalScanner = new Scanner(System.in);
        board = new char[9];
        turn = 'X';
        winner = 'N';

        // now the user/users can input the player names, and they get assigned to X and O
        System.out.println("Enter player 1 name:");
        player1Name = globalScanner.nextLine();
        System.out.println("Enter player 2 name:");
        player2Name = globalScanner.nextLine();
        System.out.println();

        // Assign X or O to players
        System.out.println(player1Name + " will be X and " + player2Name + " will be O.");

        // here the initialization the game board takes place
        for (int a = 0; a < 9; a++)
        {
            board[a] = (char) (a + '1');
        }
        System.out.println();
        System.out.println("Welcome to 3x3 Tic Tac Toe!");
        printBoard();

        System.out.println("X will play first. Enter a slot number to place X in:");

        // this is where the Game Loop is declared
        // this is the main game loop, the game will continue until the winner variable is not equal to N
        try
        {
            while (winner == 'N')
            {
                int numInput;
                try
                {
                    numInput = globalScanner.nextInt();
                    if (numInput > 0 && numInput <= 9)
                    {
                        // this checks if the slot is already occupied

                        if (board[numInput - 1] != 'X' && board[numInput - 1] != 'O')
                        {
                            board[numInput - 1] = turn;
                            turn = (turn == 'X') ? 'O' : 'X';
                            printBoard();

                            // now it is time to check for the winner

                            winner = checkWinner();
                            if (winner == 'X')
                            {
                                System.out.println(player1Name + " wins!");
                                System.out.println(player2Name + " lost!");
                                System.out.println("Do you want to reset the board and play again? (Yes or No)");
                                String answer = globalScanner.next().toLowerCase();
                                triggerGame(answer);
                            } else if (winner == 'O')
                            {
                                System.out.println(player2Name + " wins!");
                                System.out.println(player1Name + " lost!");
                                System.out.println("Do you want to reset the board and play again? (Yes or No)");
                                String answer = globalScanner.next().toLowerCase();
                                triggerGame(answer);
                            } else if (winner == 'D')
                            {
                                System.out.println("It's a draw!");
                                System.out.println("Do you want to reset the board and play again? (Yes or No)");
                                String answer = globalScanner.next().toLowerCase();
                                triggerGame(answer);
                            }
                        } else
                        {
                            // prompt user that a particular slot is already taken
                            System.out.println("Slot already filled. Please enter a valid slot number (1-9).");
                        }
                    } else
                    {
                        // prompt the user for a valid input
                        System.out.println("Invalid input. Please enter a valid slot number (1-9).");
                    }
                } catch (InputMismatchException e)
                {
                    // prompt the user for a valid input
                    System.out.println("Invalid input. Please enter a valid slot number (1-9).");
                    globalScanner.next();
                }
            }
        } catch (Exception ex)
        {
            //catch exception that might occur
            System.out.println("Inside Catch Block");
            System.out.println("Exception in game: " + ex.getMessage());
        } finally
        {
            // here the scanner is closed
            globalScanner.close();

            // system exiting with the exit code 1: stops the program
            System.exit(1);
        }
    }
}

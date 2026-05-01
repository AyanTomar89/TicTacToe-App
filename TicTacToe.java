import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static boolean isHumanTurn = true;
    static boolean gameOver = false;

    static char humanSymbol = 'X';
    static char computerSymbol = 'O';

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (!gameOver) {

            if (isHumanTurn) {

                System.out.print("Enter slot number (1-9): ");
                int slot = scanner.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (board[row][col] == '-') {

                    board[row][col] = humanSymbol;

                    printBoard();

                    if (hasWon(humanSymbol)) {

                        System.out.println("Human wins");
                        gameOver = true;
                    }

                    isHumanTurn = false;
                }

            } else {

                Random random = new Random();

                int slot, row, col;

                do {

                    slot = random.nextInt(9) + 1;

                    row = (slot - 1) / 3;
                    col = (slot - 1) % 3;

                } while (board[row][col] != '-');

                board[row][col] = computerSymbol;

                printBoard();

                if (hasWon(computerSymbol)) {

                    System.out.println("Computer wins");
                    gameOver = true;
                }

                isHumanTurn = true;
            }
        }
    }


    static boolean hasWon(char symbol) {

        for (int i = 0; i < 3; i++) {

            if (board[i][0] == symbol &&
                board[i][1] == symbol &&
                board[i][2] == symbol)
                return true;

            if (board[0][i] == symbol &&
                board[1][i] == symbol &&
                board[2][i] == symbol)
                return true;
        }

        if (board[0][0] == symbol &&
            board[1][1] == symbol &&
            board[2][2] == symbol)
            return true;

        if (board[0][2] == symbol &&
            board[1][1] == symbol &&
            board[2][0] == symbol)
            return true;

        return false;
    }


    static void printBoard() {

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
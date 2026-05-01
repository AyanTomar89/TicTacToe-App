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

                int slot = scanner.nextInt();

                int row = (slot - 1) / 3;
                int col = (slot - 1) % 3;

                if (board[row][col] == '-') {

                    board[row][col] = humanSymbol;

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

                isHumanTurn = true;
            }

            printBoard();
        }
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
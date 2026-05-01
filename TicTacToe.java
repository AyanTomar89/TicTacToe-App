import java.util.Random;

public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    static char computerSymbol = 'O';

    public static void main(String[] args) {

        computerMove();

        printBoard();
    }

    static void computerMove() {

        Random random = new Random();

        int slot;
        int row;
        int col;

        do {

            slot = random.nextInt(9) + 1;

            row = (slot - 1) / 3;
            col = (slot - 1) % 3;

        } while (board[row][col] != '-');

        board[row][col] = computerSymbol;

        System.out.println("Computer placed at slot: " + slot);
    }

    static void printBoard() {

        System.out.println("Current Board:");

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}
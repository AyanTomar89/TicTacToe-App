import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static Scanner scanner = new Scanner(System.in);

    static char humanSymbol = 'X';


    public static void main(String[] args) {

        initializeBoard();

        int slot = getUserSlot();

        int row = getRowFromSlot(slot);
        int col = getColFromSlot(slot);

        if (isValidMove(row, col)) {

            placeMove(row, col, humanSymbol);

            System.out.println("Move placed successfully");

        } else {

            System.out.println("Invalid move");
        }

        printBoard();
    }



    static void initializeBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }



    static int getUserSlot() {

        System.out.print("Enter slot number (1-9): ");
        return scanner.nextInt();
    }



    static int getRowFromSlot(int slot) {

        return (slot - 1) / 3;
    }


      static int getColFromSlot(int slot) {

        return (slot - 1) % 3;
    }



    static boolean isValidMove(int row, int col) {

        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }



    static void placeMove(int row, int col, char symbol) {

        board[row][col] = symbol;
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
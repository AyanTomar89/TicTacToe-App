import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static boolean humanTurn;
    static char humanSymbol;
    static char computerSymbol;

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        initializeBoard();
        tossAndAssignSymbols();

        int slot = getUserSlot();

        System.out.println("Slot entered: " + slot);

        printBoard();
    }

    static void initializeBoard() {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    static void tossAndAssignSymbols() {

        Random random = new Random();
        int toss = random.nextInt(2);

        if (toss == 0) {

            humanTurn = true;
            humanSymbol = 'X';
            computerSymbol = 'O';

            System.out.println("Human starts first with symbol X");

        } else {

            humanTurn = false;
            humanSymbol = 'O';
            computerSymbol = 'X';

            System.out.println("Computer starts first with symbol X");
        }
    }

    static int getUserSlot() {

        System.out.print("Enter slot number (1-9): ");
        int slot = scanner.nextInt();

        return slot;
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
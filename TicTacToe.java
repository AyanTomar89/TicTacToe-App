import java.util.Random;

public class TicTacToe {

    static char[][] board = new char[3][3];

    static boolean humanTurn;
    static char humanSymbol;
    static char computerSymbol;

    public static void main(String[] args) {

        initializeBoard();
        tossAndAssignSymbols();
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
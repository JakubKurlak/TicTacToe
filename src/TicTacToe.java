import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int size = 3;
        char[][] board1 = new char[size][size];

        char[][] board = {{'O', 'X', 'X'},
                          {'O', 'X', ' '},
                          {' ', 'O', 'O'}};

        TicTacToe.printBoard(board, size);


    }

    public static void printBoard(char[][] board, int size) {
        //column headers
        for (int i = 0; i < size; i++) {
            System.out.print("\t" + i + ":");
        }
        System.out.println();

        //printing rows
        for (int row = 0; row < size; row++) {
            System.out.print(row + ": " + "\t");
            for (int column = 0; column < size; column++) {
                System.out.print(board[row][column] + "\t");
            }
            System.out.println();
        }
    }
}

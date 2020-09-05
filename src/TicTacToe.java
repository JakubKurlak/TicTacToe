import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hello there, enter the size of the board");
        TicTacToe.enterTheSizeOfTheBoard();

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

    public static void enterTheSizeOfTheBoard() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                int size = Integer.parseInt(reader.readLine());
                if (size >= 3 && size <= 20) {
                    break;
                } else {
                    System.out.println("Maximum board size is 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 3 to 20");
            }
        } while (true);
        reader.close();
    }
}

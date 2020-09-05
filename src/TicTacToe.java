import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToe {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static char actualSymbol;
    public static volatile int size;
    public static int counter = 0;

    public static void main(String[] args) throws IOException {
        System.out.println("Hello there, enter the size of the board");
        size = TicTacToe.enterTheSizeOfTheBoard();
        char[][] board = new char[size][size];
        System.out.println("Choose your symbol X or O");
        TicTacToe.ChooseYourSymbol();
        TicTacToe.printBoard(board, size);
        while (counter < size * size) {
            System.out.println("Your symbol is: " + actualSymbol);
            System.out.println("Enter the row index");
            int row = TicTacToe.enterTheRow();
            System.out.println("Enter the column index");
            int column = TicTacToe.enterTheColumn();
            boolean correctMove = board[row][column] == 0;
            if(!correctMove){
                System.out.println("Invalid move!");
                continue;
            }
            board[row][column] = actualSymbol;
            TicTacToe.printBoard(board, size);
            actualSymbol = actualSymbol == 'X' ? 'O' : 'X';
            counter++;
        }

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

    public static int enterTheSizeOfTheBoard() throws IOException {
        int size;
        do {
            try {
                size = Integer.parseInt(reader.readLine());
                if (size >= 3 && size <= 20) {
                    break;
                } else {
                    System.out.println("Maximum board size is 20");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 3 to 20");
            }
        } while (true);
        return size;
    }


    public static void ChooseYourSymbol() throws IOException {
        try {
            do {
                String stringFirstPlayerSymbol = reader.readLine();
                if (stringFirstPlayerSymbol.equals("X")) {
                    actualSymbol = 'X';
                    break;
                } else if (stringFirstPlayerSymbol.equals("O")) {
                    actualSymbol = 'O';
                    break;
                } else {
                    System.out.println("Choose your symbol X or O");
                }
            } while (true);
        } catch (Exception e) {
        }
    }

    public static int enterTheRow() throws IOException {
        int row = 0;
        do {
            try {
                row = Integer.parseInt(reader.readLine());
                if (row >= 0 && row <= size - 1) {
                    break;
                } else {
                    System.out.println("Maximum row is " + (size - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 0 to " + (size - 1));
            }
        } while (true);
        return row;
    }

    public static int enterTheColumn() throws IOException {
        int column = 0;
        do {
            try {
                column = Integer.parseInt(reader.readLine());
                if (column >= 0 && column <= size - 1) {
                    break;
                } else {
                    System.out.println("Maximum row is " + (size - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 0 to " + (size - 1));
            }
        } while (true);
        return column;
    }
}

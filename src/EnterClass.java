import java.io.IOException;

public class EnterClass {
    public static int enterTheSizeOfTheBoard() throws IOException {
        int size;
        do {
            try {
                size = Integer.parseInt(TicTacToe.reader.readLine());
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

    public static int enterTheRow() throws IOException {
        int row = 0;
        do {
            try {
                row = Integer.parseInt(TicTacToe.reader.readLine());
                if (row >= 0 && row <= TicTacToe.size - 1) {
                    break;
                } else {
                    System.out.println("Maximum row is " + (TicTacToe.size - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 0 to " + (TicTacToe.size - 1));
            }
        } while (true);
        return row;
    }

    public static int enterTheColumn() throws IOException {
        int column = 0;
        do {
            try {
                column = Integer.parseInt(TicTacToe.reader.readLine());
                if (column >= 0 && column <= TicTacToe.size - 1) {
                    break;
                } else {
                    System.out.println("Maximum row is " + (TicTacToe.size - 1));
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter the number from 0 to " + (TicTacToe.size - 1));
            }
        } while (true);
        return column;
    }
}

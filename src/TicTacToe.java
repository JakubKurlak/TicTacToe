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
        size = EnterClass.enterTheSizeOfTheBoard();
        char[][] board = new char[size][size];
        System.out.println("Choose your symbol X or O");
        SymbolClass.ChooseYourSymbol();

        boolean Continue = true;
        while (counter < size * size && Continue) {
            PrintClass.printBoard(board, size);
            boolean correctMove = MakeMove.makeMove(board);
            if (correctMove) {
                boolean isWinnerInRow = WinningClass.checkIsWinnerInRow(board, actualSymbol);
                boolean isWinnerInColumn = WinningClass.checkIsWinnerInColumn(board, actualSymbol);
                boolean isWinnerInCross1 = WinningClass.checkIsWinnerInCross1(board, actualSymbol);
                boolean isWinnerInCross2 = WinningClass.checkIsWinnerInCross2(board, actualSymbol);
                if (isWinnerInRow || isWinnerInColumn || isWinnerInCross1 || isWinnerInCross2) {
                    System.out.println(actualSymbol + " win!!! \nCongratulations !!!");
                    Continue = false;
                }
                actualSymbol = actualSymbol == 'X' ? 'O' : 'X';
                counter++;
            }
        }
    }
}

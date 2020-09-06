import java.io.IOException;

public class MakeMove {
    public static boolean makeMove(char[][] board) throws IOException {
        System.out.println("Your symbol is: " + TicTacToe.actualSymbol);
        System.out.println("Enter the row index");
        int row = EnterClass.enterTheRow();
        System.out.println("Enter the column index");
        int column = EnterClass.enterTheColumn();
        boolean correctMove = board[row][column] == 0;
        if (!correctMove) {
            System.out.println("Invalid move!");
            return false;
        }
        board[row][column] = TicTacToe.actualSymbol;
        return true;
    }
}

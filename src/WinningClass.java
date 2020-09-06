public class WinningClass {

    public static boolean checkIsWinnerInRow(char[][] board, char actualSymbol) {
        //win if are three symbols in row
        for (int row = 0; row < TicTacToe.size; row++) {
            boolean win = true;
            for (int column = 0; column < TicTacToe.size; column++) {
                if (board[row][column] != actualSymbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIsWinnerInColumn(char[][] board, char actualSymbol) {
        //win if are three symbols in column
        for (
                int column = 0;
                column < TicTacToe.size; column++) {
            boolean win = true;
            for (int row = 0; row < TicTacToe.size; row++) {
                if (board[row][column] != actualSymbol) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIsWinnerInCross1(char[][] board, char actualSymbol) {
        //win if are three symbols in cross
        for (int i = 0; i < TicTacToe.size; i++) {
            if (board[i][i] != actualSymbol) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIsWinnerInCross2(char[][] board, char actualSymbol) {
        //win if are three symbols in cross
        if (board[0][2] != actualSymbol ||
                board[1][1] != actualSymbol ||
                board[2][0] != actualSymbol) {
            return false;
        }
        return true;
    }
}

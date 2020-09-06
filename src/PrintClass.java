public class PrintClass {
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

public class TicTacToe {
    public static void main(String[] args) {
        int size = 6;
        char[][] table = new char[size][size];

        char[][] exampleTable = {{'O', 'X', 'X'},
                                 {'O', 'X', ' '},
                                 {' ', 'O', 'O'}};


        for (int i = 0; i < size ; i++) {
            System.out.print("\t" + i + ":");
        }
        System.out.println();

        for (int row = 0; row < table.length; row++) {
            System.out.print(row + ": " +"\t");
            for (int column = 0; column < table[row].length; column++) {
                System.out.print(table[row][column] + "\t");
            }
            System.out.println();
        }





    }

}

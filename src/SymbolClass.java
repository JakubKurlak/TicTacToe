import java.io.IOException;

public class SymbolClass {
    public static void ChooseYourSymbol() throws IOException {
        try {
            do {
                String stringFirstPlayerSymbol = TicTacToe.reader.readLine();
                if (stringFirstPlayerSymbol.equals("X")) {
                    TicTacToe.actualSymbol = 'X';
                    break;
                } else if (stringFirstPlayerSymbol.equals("O")) {
                    TicTacToe.actualSymbol = 'O';
                    break;
                } else {
                    System.out.println("Choose your symbol X or O");
                }
            } while (true);
        } catch (Exception e) {
        }
    }
}

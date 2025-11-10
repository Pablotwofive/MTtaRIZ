public class Main {
    public static void main(String[] args) {
        System.out.println("=== Гра Хрестики-Нолики ===");
 
        Player player1 = new Player("Гравець 1", 'X');
        Player player2 = new Player("Гравець 2", 'O');
 
        GameBoard board = new GameBoard();
   
        Player currentPlayer = player1;

        while (true) {
            board.printBoard();
            int[] move = currentPlayer.makeMove();
            if (!board.makeMove(move[0], move[1], currentPlayer.getSymbol())) {
                continue; 
            }

            
            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println(" Переможець " + currentPlayer.getName() + "!");
                break;
            }
   
            if (board.isFull()) {
                board.printBoard();
                System.out.println(" Нiчия!");
                break;
            }
 
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}

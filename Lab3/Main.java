public class Main {
    public static void main(String[] args) {
        System.out.println("=== Гра Хрестики-Нолики ===");

        // Створення об'єктів гравців
        Player player1 = new Player("Гравець 1", 'X');
        Player player2 = new Player("Гравець 2", 'O');

        // Створення ігрового поля
        GameBoard board = new GameBoard();

        // Змінна для відстеження черги
        Player currentPlayer = player1;

        while (true) {
            board.printBoard();
            int[] move = currentPlayer.makeMove();
            if (!board.makeMove(move[0], move[1], currentPlayer.getSymbol())) {
                continue; // якщо хід неправильний — спробувати знову
            }

            // Перевірка перемоги
            if (board.checkWin(currentPlayer.getSymbol())) {
                board.printBoard();
                System.out.println("🎉 Переміг " + currentPlayer.getName() + "!");
                break;
            }

            // Перевірка нічиї
            if (board.isFull()) {
                board.printBoard();
                System.out.println("🤝 Нічия!");
                break;
            }

            // Зміна гравця
            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }
}

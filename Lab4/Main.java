import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Гра Хрестики-Нолики ===");
        Scanner sc = new Scanner(System.in);
        Db db = new Db();

        String username1, password1;
        String username2, password2;

        // === Авторизація гравця 1 ===
        System.out.println("Авторизація гравця 1:");
        System.out.print("Логін: ");
        username1 = sc.nextLine().trim();
        System.out.print("Пароль: ");
        password1 = sc.nextLine().trim();

        if (!db.authenticate(username1, password1)) {
            System.out.println("❌ Невірний логін або пароль для гравця 1!");
            db.close();
            return;
        }
        System.out.println("✅ Гравець 1 авторизований: " + username1);

        // === Авторизація гравця 2 ===
        System.out.println("\nАвторизація гравця 2:");
        System.out.print("Логін: ");
        username2 = sc.nextLine().trim();
        System.out.print("Пароль: ");
        password2 = sc.nextLine().trim();

        if (!db.authenticate(username2, password2)) {
            System.out.println("❌ Невірний логін або пароль для гравця 2!");
            db.close();
            return;
        }
        System.out.println("✅ Гравець 2 авторизований: " + username2);

        db.close();

        // 🔹 Тут идёт твоя логика игры (если классы Player и GameBoard есть)
        System.out.println("\n🎮 Обидва гравці авторизовані! Можна починати гру!");
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


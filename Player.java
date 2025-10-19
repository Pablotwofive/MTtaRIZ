import java.util.Scanner;

public class Player {
    private String name;   // ім'я гравця
    private char symbol;   // символ гравця (X або O)

    // Конструктор
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }

    // Метод для виконання ходу
    public int[] makeMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " (" + symbol + "), введи рядок (1-3): ");
        int row = sc.nextInt() - 1;
        System.out.print(name + " (" + symbol + "), введи стовпець (1-3): ");
        int col = sc.nextInt() - 1;
        return new int[]{row, col};
    }

    // Гетери
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

import java.util.Scanner;

public class Player {
    private String name;   
    private char symbol;   

    
    public Player(String name, char symbol) {
        this.name = name;
        this.symbol = symbol;
    }


    public int[] makeMove() {
        Scanner sc = new Scanner(System.in);
        System.out.print(name + " (" + symbol + "), введи рядок (1-3): ");
        int row = sc.nextInt() - 1;
        System.out.print(name + " (" + symbol + "), введи стовпець (1-3): ");
        int col = sc.nextInt() - 1;
        sc.close();
        return new int[]{row, col};
    }
 
    public String getName() {
        return name;
    }

    public char getSymbol() {
        return symbol;
    }
}

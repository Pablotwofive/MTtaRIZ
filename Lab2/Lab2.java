public class Lab2 {

    // Метод для вывода ёлки
    public static void printTree(int levels) {
        for (int i = 0; i < levels; i++) {
            for (int j = 0; j < levels - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Метод для вывода 2D массива
    public static void printArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = value;
                value += 3;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Вызов метода ёлки
        System.out.println("Ялинка:");
        printTree(6);

        // Вызов метода массива
        System.out.println("\nМасив:");
        printArray(3, 4);
    }
}

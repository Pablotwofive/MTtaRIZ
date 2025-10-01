class Lab2 {

    // 1. Метод для виводу ялинки
    public static void printTree(int levels) {
        for (int i = 0; i < levels; i++) {
            // пробіли
            for (int j = 0; j < levels - i - 1; j++) {
                System.out.print(" ");
            }
            // зірочки
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 2. Метод для створення та виводу 2D масиву
    public static void printArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = value;
                value += 3; // кожен елемент на 3 більший за попередній
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // main для запуску методів
    public static void main(String[] args) {
        System.out.println("Ялинка:");
        printTree(6); // тут задається кількість рівнів

        System.out.println("\nМасив:");
        printArray(3, 4); // наприклад, масив 3х4
    }
}

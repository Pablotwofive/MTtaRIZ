public class Lab2 {

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
        Tree tree = new Tree(6);

        System.out.println("Ялинка:");
        tree.printTree();

        System.out.println("\nМасив:");
        printArray(3, 4);
    }
}



public class Tree {

    private int levels;

    public Tree(int levels) {
        this.levels = levels;
    }

    public void printTree() {
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
}

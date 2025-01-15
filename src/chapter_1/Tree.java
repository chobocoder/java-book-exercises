package chapter_1;

public class Tree {

    /**
     * Write, compile, and test a class that displays the following pattern on the screen:
     *    X
     *   XXX
     *  XXXXX
     * XXXXXXX
     *    X
     * Save the class as Tree.java.
     */

    public static void main(String[] args) {
        int height = 4;
        for (int i = 0; i < height; i++) {
            int spaces = height - i - 1;

            int xCount = 2 * i + 1;

            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < xCount; j++) {
                System.out.print("X");
            }

            System.out.println();
        }

        for (int i = 0; i < height - 1; i++) {
            System.out.print(" ");
        }
        System.out.println("X");
    }


}

package introduction;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         BinaryTree tree = new BinaryTree();
//         tree.populate(scanner);
//         tree.display();
//        tree.prettyDisplay();

        BST tree = new BST();
//        int[] arr = { 5, 2, 7, 1, 4, 6, 9, 8, 3, 10 };
//        tree.populate(arr);
//        tree.display();

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        tree.populatedSorted(arr);
        tree.display();
    }
}

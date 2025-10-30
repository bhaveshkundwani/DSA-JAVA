package RecursionOnStrings;

import java.util.ArrayList;

public class Dice {
    public static void main(String[] args) {
        printCombinations("", 4);
        System.out.println();
        System.out.println(storeCombinations("", 4));
        diceFace("", 6, 2);
    }

    public static void printCombinations(String ans, int target) {
        if (target == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 1; i <= 6 && i <= target; i++) {
            printCombinations(ans + i, target - i);
        }
    }

    public static void diceFace(String ans, int target, int face) {
        if (target == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 1; i <= face && i <= target; i++) {
            diceFace(ans + i, target - i, face);
        }
    }

    public static ArrayList<String> storeCombinations(String ans, int target) {
        if (target == 0) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
            res.addAll(storeCombinations(ans + i, target - i));
        }
        return res;
    }
}

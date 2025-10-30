package RecursionOnStrings;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
//        printAllPermutations("", "abc");
//        System.out.println();
//
//        ArrayList<String> ans = storeAllPermutations("", "abc");
//        System.out.println(ans);

        System.out.println(countPermutations("", "abc"));
    }

    public static void printAllPermutations(String ans, String str) {
        if (str.isEmpty()){
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            printAllPermutations(first + ch + second, str.substring(1));
        }
    }

    public static ArrayList<String> storeAllPermutations(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        ArrayList<String> res = new ArrayList<>();
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            res.addAll(storeAllPermutations(first + ch + second, str.substring(1)));
        }

        return res;
    }

    public static int countPermutations(String ans, String str) {
        if (str.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = str.charAt(0);
        for (int i = 0; i <= ans.length(); i++){
            String first = ans.substring(0, i);
            String second = ans.substring(i, ans.length());
            count = count + countPermutations(first + ch + second, str.substring(1));
        }

        return count;
    }
}

package RecursionOnStrings;

import java.util.*;

public class Subsets {
    public static void main(String[] args) {
//        String s = "abc";
//        List<String> res = new ArrayList<>();
//        subsets("", s, 0, res);
//        System.out.println(res);

//        printSubsets("", "abc");

        System.out.println(storeSubsets("", "abc"));
    }

    public static void subsets(String ans, String str, int idx, List<String> list){
        if(idx == str.length()){
            if (!ans.isEmpty()) list.add(ans);
            return;
        }
        char ch = str.charAt(idx);
        subsets(ans + ch, str, idx + 1, list); // pick

        subsets(ans, str, idx + 1, list); // skip
    }

    public static void printSubsets(String ans, String str){
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        printSubsets(ans + ch, str.substring(1)); // pick

        printSubsets(ans, str.substring(1)); // skip
    }

    public static ArrayList<String> storeSubsets(String ans, String str){
        ArrayList<String> list = new ArrayList<>();
        if (str.isEmpty()) {
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> left = storeSubsets(ans + ch, str.substring(1)); // pick

        ArrayList<String> right = storeSubsets(ans, str.substring(1)); // skip

        left.addAll(right);
        return left;
    }
}

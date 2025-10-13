package RecursionOnStrings;

import java.util.*;

public class PrintSubsets {
    public static void main(String[] args) {
        String s = "abc";

        List<String> res = new ArrayList<>();
        subsets("", s, 0, res);

        System.out.println(res);
    }

    public static void subsets(String ans, String str, int idx, List<String> list){
        if(idx == str.length()){
            if (ans.length() != 0) list.add(ans);
            return;
        }
        char ch = str.charAt(idx);
        subsets(ans + ch, str, idx + 1, list); // pick

        subsets(ans, str, idx + 1, list); // skip
    }
}

package RecursionOnStrings;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        subseqAscii("", "ab");
        System.out.println();
        System.out.println(storeSubseqAscii("", "ab"));
    }

    public static void subseqAscii(String ans, String str) {
        if (str.isEmpty()) {
            System.out.print(ans + " ");
            return;
        }

        char ch = str.charAt(0);
        subseqAscii(ans + ch, str.substring(1));
        subseqAscii(ans, str.substring(1));
        subseqAscii(ans + (ch+0), str.substring(1));
    }

    public static ArrayList<String> storeSubseqAscii(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        char ch = str.charAt(0);
        ArrayList<String> first = storeSubseqAscii(ans + ch, str.substring(1));
        ArrayList<String> second = storeSubseqAscii(ans, str.substring(1));
        ArrayList<String> third = storeSubseqAscii(ans + (ch+0), str.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }
}

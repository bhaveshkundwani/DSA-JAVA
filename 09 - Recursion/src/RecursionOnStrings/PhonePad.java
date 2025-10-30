package RecursionOnStrings;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
        pad("", "12");
        System.out.println(padStore("", "12"));
        System.out.println(padCount("", "12"));
    }

    public static void pad(String ans, String str) {
        if (str.isEmpty()) {
            System.out.println(ans);
            return;
        }

        int digit = str.charAt(0) - '0';
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            pad(ans + ch, str.substring(1));
        }
    }

    public static ArrayList<String> padStore(String ans, String str) {
        if (str.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(ans);
            return list;
        }

        int digit = str.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            list.addAll(padStore(ans + ch, str.substring(1)));
        }
        return list;
    }

    public static int padCount(String ans, String str) {
        if (str.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = str.charAt(0) - '0';
        ArrayList<String> list = new ArrayList<>();
        for (int i = (digit - 1) * 3; i < digit * 3; i++){
            char ch = (char) ('a' + i);
            count = count + padCount(ans + ch, str.substring(1));
        }
        return count;
    }
}

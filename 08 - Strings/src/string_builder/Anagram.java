package string_builder;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = new String("listen");
        String s2 = new String("silent");

        if (areAnagrams(s1, s2))
            System.out.println("Anagrams");
        else
            System.out.println("Not anagrams");
    }

//    1st way to solve
//    public static boolean areAnagrams(String s1, String s2) {
//        int n1 = s1.length();
//        int n2 = s2.length();
//        if (n1 != n2) return false;
//
//        char[] arr1 = s1.toCharArray();
//        char[] arr2 = s2.toCharArray();
//        Arrays.sort(arr1);
//        Arrays.sort(arr2);
//
//        s1 = new String(arr1);
//        s2 = new String(arr2);
//
//        return s1.equals(s2);
//    }


//    2nd way to solve
    public static boolean areAnagrams(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n1 != n2) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        for (int i = 0; i < n1; i++){
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }
}

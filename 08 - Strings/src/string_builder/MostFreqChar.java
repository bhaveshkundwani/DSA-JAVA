package string_builder;

import java.util.Arrays;

public class MostFreqChar {
    public static void main(String[] args) {
        String s = "auwncazzzowoemzzowmzz";
        System.out.println(getMaxOccurringChar(s));
    }

//    brute force solution
//    Time Complexity = O(n ^ 2), Space Complexity = O(1)
//    public static char getMaxOccurringChar(String s) {
//        int n = s.length();
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//
//        for (int i = 0; i < n; i++){
//            int freq = 1;
//            char ch = s.charAt(i);
//            for (int j = i + 1; j < n; j++){
//                if (s.charAt(j) == ch) freq++;
//            }
//            if (freq > maxFreq){
//                maxFreq = freq;
//                ans = ch;
//            }
//            else if (freq == maxFreq && ch < ans){
//                ans = ch;
//            }
//        }
//
//        return ans;
//    }


//    better solution -> sliding window technique
//    Time Complexity = O(n log n), Space Complexity = O(n)
//    public static char getMaxOccurringChar(String s) {
//        int n = s.length();
//        int maxFreq = -1;
//        char ans = s.charAt(0);
//
//        char[] arr = s.toCharArray();
//        Arrays.sort(arr);
//
//        int i = 0, j = 0;
//        while(j < n){
//            if (arr[i] == arr[j]) j++;
//            else {
//                int freq = j - i;
//                if (freq > maxFreq){
//                    maxFreq = freq;
//                    ans = arr[i];
//                }
//                i = j;
//            }
//        }
//
//        int freq = j - i;
//        if (freq > maxFreq){
//            maxFreq = freq;
//            ans = arr[i];
//        }
//
//        return ans;
//    }


//    better solution -> using frequency array
//    Time Complexity = O(n), Space Complexity = O(1) because we only create array of size 26, which is constant
    public static char getMaxOccurringChar(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (int i = 0; i < n; i++){
            char ch = s.charAt(i);
            int idx = ch - 97;
            freq[idx]++;
        }

        int maxFreq = 0;
        char ans = s.charAt(0);

        for (int i = 0; i < 26; i++){
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                ans = (char)(i + 97);
            }
        }

        return ans;
    }
}

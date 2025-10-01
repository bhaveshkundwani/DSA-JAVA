package string_builder;

public class NonRepeatingChar {
    public static void main(String[] args) {
        String s = "racecar";
        System.out.println(nonRepeatingChar(s));
    }

//    brute force solution
//    Time Complexity = O(n ^ 2), Space Complexity = O(1)
//    public static char nonRepeatingChar(String s) {
//        // code here
//        int n = s.length();
//        for (int i = 0; i < n; ++i) {
//            boolean flag = false;
//            for (int j = 0; j < n; j++) {
//                if (i != j && s.charAt(i) == s.charAt(j)) {
//                    flag = true;
//                    break;
//                }
//            }
//            if (!flag)
//                return s.charAt(i);
//        }
//
//        return '$';
//    }


//    optimal solution
//    Time Complexity = O(n), Space Complexity = O(1)
    public static char nonRepeatingChar(String s) {
        int n = s.length();
        int[] freq = new int[26];
        char[] arr = s.toCharArray();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            int idx = ch - 97; // idx = ch - 'a'
            freq[idx]++;
        }

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (freq[ch - 97] == 1) {
                return ch;
            }
        }
        return '$';
    }

}

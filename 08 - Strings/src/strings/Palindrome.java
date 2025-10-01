package strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();
        int n = str.length();

        boolean ans = isPalindrome(str);
        if(ans)
            System.out.println("Entered string is palindrome");
        else
            System.out.println("Entered string is not palindrome");
    }

    public static boolean isPalindrome(String s){
        int i = 0, j = s.length() - 1;

        while (i <= j){
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }

        return true;
    }
}

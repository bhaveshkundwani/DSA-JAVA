package BasicQuestions;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        System.out.println(isPalindrome(n));
    }

    public static boolean isPalindrome(int n){
        return n == rev(n, 0);
    }

    public static int rev(int n, int r){
        if (n == 0) return r;
        return rev(n / 10, r * 10 + n % 10);
    }
}

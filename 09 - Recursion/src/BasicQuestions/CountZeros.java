package BasicQuestions;

import java.util.Scanner;

public class CountZeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(countZeros(n));
    }

    public static int countZeros(int n){
        return helper(n, 0);
    }

    public static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }

        int rem = n % 10;
        if (rem == 0) {
            return helper(n/10, c+1);
        }
        return helper(n/10, c);
    }
}

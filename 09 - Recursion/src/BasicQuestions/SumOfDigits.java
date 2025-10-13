package BasicQuestions;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(digitSum(n));
    }

    public static int digitSum(int n){
        if (n == 0) return 0;
        return (n % 10) + digitSum(n / 10);
    }
}

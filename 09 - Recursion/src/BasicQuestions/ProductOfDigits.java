package BasicQuestions;

import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println(digitProduct(n));
    }

    public static int digitProduct(int n){
        if (n % 10 == n) return n;
        return (n % 10) * digitProduct(n / 10);
    }
}

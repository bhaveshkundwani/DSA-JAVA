package Introduction;

import java.util.Scanner;

// print numbers from N to 1 using Recursion
public class NToOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        print(n);
    }

    static void print(int n){
        if (n == 0) return;
        System.out.print(n + " ");
        print(n - 1);
    }
}

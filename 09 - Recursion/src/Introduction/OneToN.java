package Introduction;

import java.util.Scanner;

// print numbers from 1 to N using Recursion
public class OneToN {
//    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
//        print(1, n);    // 1st way

//        print(1);  // 2nd way

        print(n);  // 3rd way
    }

//    3rd way
    static void print(int n){
        if (n == 0) return;
        print(n - 1);
        System.out.print(n + " ");
    }

//    2nd way -> using global variable
//    static void print(int x){
//        if (x > n) return;
//        System.out.print(x + " ");
//        print(x + 1);
//    }

//    1st way -> using 2 parameters
//    static void print(int x, int n){
//        if (x > n) return;
//        System.out.print(x + " ");
//        print(x + 1, n);
//    }
}

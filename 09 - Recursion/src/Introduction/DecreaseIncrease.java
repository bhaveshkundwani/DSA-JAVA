package Introduction;

import java.util.Scanner;

// print the numbers in first decreasing then increasing like 5 4 3 2 1 1 2 3 4 5
public class DecreaseIncrease {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printNumbers(n);
    }

//    static void printNumbers(int n) {
//        if (n == 0) return;
//        System.out.print(n + " ");
//        printNumbers(n - 1);
//        System.out.print(n + " ");
//    }

//    this prints 1 only one time
//    static void printNumbers(int n) {
//        if (n == 0) return;
//        System.out.print(n + " ");
//        printNumbers(n - 1);
//        if (n != 1) System.out.print(n + " ");
//    }

//    this prints 1 only one time
    static void printNumbers(int n) {
        if (n == 1) {
            System.out.print(n + " ");
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
        System.out.print(n + " ");
    }
}

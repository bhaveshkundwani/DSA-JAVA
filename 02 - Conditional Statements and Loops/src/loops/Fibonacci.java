package loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
//        print fibonacci sequence
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//
//        System.out.print(a + " " + b);
//        int i = 2;
//
//        while (i <= n) {
//            int c = a + b;
//            System.out.print(" " + c);
//            a = b;
//            b = c;
//            i++;
//        }


//        Print nth term of fibonacci
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        int i = 2;

        while (i <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            i++;
        }

        System.out.println(b);
    }
}

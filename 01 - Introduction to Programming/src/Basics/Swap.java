package Basics;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a and b before swap, a = " + a + " b = " +b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("a and b after swap, a = " + a + " b = " +b);
    }
}

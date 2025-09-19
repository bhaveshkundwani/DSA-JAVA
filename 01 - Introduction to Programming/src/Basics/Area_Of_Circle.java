package Basics;

import java.util.Scanner;

public class Area_Of_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");

        int r = sc.nextInt();
        double pi = 3.141592;

        double area = pi * r * r;
        System.out.println("Area of Circld = " + area);

    }
}

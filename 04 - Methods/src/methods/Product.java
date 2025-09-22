package methods;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
//        Define a method that returns the product of two numbers entered by user.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number : ");
        int n1 = sc.nextInt();
        System.out.println("Enter 2nd number : ");
        int n2 = sc.nextInt();

        int result = calculateProduct(n1, n2);
        System.out.println("The product is : " + result);
    }

    static int calculateProduct(int num1, int num2){
        return num1 * num2;
    }
}

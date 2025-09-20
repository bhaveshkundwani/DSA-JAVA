package conditional_statements;

import java.util.Scanner;

public class Check_Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

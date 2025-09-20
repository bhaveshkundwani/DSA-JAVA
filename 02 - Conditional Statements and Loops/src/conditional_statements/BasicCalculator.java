package conditional_statements;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        System.out.print("Enter the operator: ");
        char op = in.next().charAt(0);

        if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
            // input two numbers
            System.out.print("Enter two numbers: ");
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (op == '+') {
                ans = num1 + num2;
            }
            else if (op == '-') {
                ans = num1 - num2;
            }
            else if (op == '*') {
                ans = num1 * num2;
            }
            else if (op == '/') {
                if (num2 != 0) {
                    ans = num1 / num2;
                } else {
                    System.out.println("Division with 0 not allowed");
                }
            }
            else if (op == '%') {
                ans = num1 % num2;
            }
        }
        else {
            System.out.println("Invalid operation!!");
        }

        System.out.println(ans);
    }
}

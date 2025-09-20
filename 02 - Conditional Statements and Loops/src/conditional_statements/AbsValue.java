package conditional_statements;

import java.util.Scanner;

// Take integer input and print the absolute value of that integer
public class AbsValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = sc.nextInt();

        if (num < 0){
            num = -num;
        }

        System.out.println(num);
    }
}

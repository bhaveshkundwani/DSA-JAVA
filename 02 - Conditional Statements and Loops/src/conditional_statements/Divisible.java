package conditional_statements;


import java.util.Scanner;

/*
Take positive integer input and
print:
if number is divisible by 5
if number is divisible by 3
if number is divisible by 5 & 3 both
if number is not divisible by 5 or 3
 */

public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

        if (n % 5 == 0 && n % 3 == 0){
            System.out.println(n + " is divisible by 5 & 3 both");
        } else if (n % 3 == 0){
            System.out.println(n + " is divisible by 3");
        } else if (n % 5 == 0){
            System.out.println(n + " is divisible by 5");
        } else {
            System.out.println(n + " is not divisible by 5 or 3");
        }
    }
}

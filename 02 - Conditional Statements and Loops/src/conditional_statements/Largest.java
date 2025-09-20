package conditional_statements;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        int max = Integer.MIN_VALUE;

        // Q: Find the largest of the 3 numbers

//         1st way to solve
//        if (a >= b && a >= c){
//            max = a;
//        } else if (b >= a && b >= c){
//            max = b;
//        } else {
//            max = c;
//        }

//         2nd way to solve
//        if (a >= b){
//            if (a >= c){
//                max = a;
//            } else {
//                max = c;
//            }
//        } else {
//            if (b >= c){
//                max = b;
//            } else {
//               max = c;
//            }
//        }

//        3rd way to solve
        max = Math.max(c, Math.max(a, b));

        System.out.println("Maximum number = " + max);
    }
}

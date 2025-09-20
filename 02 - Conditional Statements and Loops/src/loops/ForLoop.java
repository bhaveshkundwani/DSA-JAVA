package loops;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /* syntax

        for (initialization; condition; increment/decrement) {
            // code to be executed
        }

         */

//        Print numbers from 1 to 10
//        for (int i = 1; i <= 10; i++) {
//            System.out.print(i + " ");
//        }


//        Print all even numbers from 1 to 100
//        for (int i = 1; i <= 100; i++){
//            if (i % 2 == 0){
//                System.out.print(i + " ");
//            }
//        }


//        Print all odd numbers divisible by 3 from 1 to 100
//        for (int i = 1; i <= 100; i++){
//            if (i % 2 != 0 && i % 3 == 0){
//                System.out.print(i + " ");
//            }
//        }

//        Print numbers from ‘n’ to 1.
        int n = 10;
        for (int i = n; i > 0; i--){
            System.out.print(i + " ");
        }
    }
}

package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitives
        int[] arr = new int[5];
        // input
        arr[0] = 82;
        arr[1] = 45;
        arr[2] = 28;
        arr[3] = 94;
        arr[4] = 27;
        // [82, 45, 28, 94, 27]
        System.out.println(arr[3]);  // output - 94

        // input using for loop
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        output
//        System.out.println(Arrays.toString(arr));

//        output
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        output using enhanced for loop
//        for(int num : arr){  // for every element in array, print the element
//            System.out.print(num + " ");  //  here num represents element of the array
//        }


        // array of objects
        String[] str = new String[4];
//        taking input
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

//        output
        System.out.println(Arrays.toString(str));

        // modify
        str[1] = "Virat";

//        output
        System.out.println(Arrays.toString(str));
    }
}

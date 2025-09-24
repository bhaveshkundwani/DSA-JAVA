package arrays;

import java.util.Scanner;

public class MultiDimensionalArray {
    public static void main(String[] args) {
//        syntax for multi-dimensional array
//        data_type[1st dimension][2nd dimension][]..[Nth dimension] array_name = new data_type[size1][size2]....[sizeN];


        // Multidimensional array declaration
//        int[][] arr;

        // Initializing the size of row and column respectively
//        arr = new int[1][3];

        // Initializing the values
//        arr[0][0] = 3;
//        arr[0][1] = 5;
//        arr[0][2] = 7;

        // Display the values using index
//        System.out.println("arr[0][0] = " + arr[0][0]);
//        System.out.println("arr[0][1] = " + arr[0][1]);
//        System.out.println("arr[0][2] = " + arr[0][2]);


//        2D-Array
//        Syntax (Declare, Initialize and Assigning)

//         Declaring and Initializing
//        data_type[][] array_name = new data_type[x][y];

//         Assigning Value
//        array_name[row_index][column_index] = value;

//        Basic program of 2D-Array
        // Array Initialised and Assigned
//        int[][] arr = { { 1, 2 }, { 3, 4 } };

        // Printing the Array
//        for (int i = 0; i < 2; i++){
//            for (int j = 0; j < 2; j++)
//                System.out.print(arr[i][j]+" ");
//            System.out.println();
//        }



//        Program of 2D-Array with user input

        Scanner sc = new Scanner(System.in);

        // Taking Number of Rows and Columns from User
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        System.out.println("Enter elements of array: ");

        // Taking input from user for each element of array
        // using nested for loop
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j]= sc.nextInt();
            }
        }

        System.out.println("Elements of array are: ");
        // Printing Elements of Arrays
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }
}

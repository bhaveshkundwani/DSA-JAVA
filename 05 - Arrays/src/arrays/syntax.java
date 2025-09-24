package arrays;


// 1D Array demonstration
public class syntax {
    public static void main(String[] args) {
//         syntax
//         datatype[] variable_name = new datatype[size];

//         store 5 roll numbers:
//        int[] rollNo = new int[5];
//         or directly
//        int[] rollN = {23, 12, 45, 32, 15};


//        1. Declaration of Array
        // Method 1:
//        int arr[];

        // Method 2:
//        int[] arr;

//        2. Initialization of Array
//        arr = new int[5];          // Memory for arrays is always dynamically allocated (on heap segment) in java.




//        Basic Program of Array

        // initializing array
        int[] arr = {40,55,63,17,22,68,89,97,89};

        // size of array
        int n = arr.length;

        // traversing array
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}

package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // by picking the smallest element
//        int[] arr = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};
//        int n = arr.length;
//
//        for (int i = 0; i < n - 1; i++){
//            int min_idx = i;
//            for (int j = i + 1; j < n; j++){
//                if (arr[j] < arr[min_idx])
//                    min_idx = j;
//            }
//
//            int temp = arr[i];
//            arr[i] = arr[min_idx];
//            arr[min_idx] = temp;
//        }
//
//        System.out.println(Arrays.toString((arr)));


        // by picking the largest element
        int[] arr = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};
        int n = arr.length;

        for (int i = n - 1; i > 0; i--){
            int max_idx = i;
            for (int j = i - 1; j >= 0; j--){
                if (arr[j] > arr[max_idx])
                    max_idx = j;
            }

            int temp = arr[i];
            arr[i] = arr[max_idx];
            arr[max_idx] = temp;
        }

        System.out.println(Arrays.toString((arr)));
    }
}

package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
//        int[] arr = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};
//        int n = arr.length;
//
//        for (int i = 1; i < n; i++){
//            int ele = arr[i];
//            int j = i - 1;
//            while (j >= 0 && arr[j] > ele){
//                arr[j + 1] = arr[j];
//                j--;
//            }
//            arr[j + 1] = ele;
//        }
//
//        System.out.println(Arrays.toString((arr)));


//        descending
        int[] arr = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};
        int n = arr.length;

        for (int i = 1; i < n; i++){
            int ele = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] < ele){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = ele;
        }

        System.out.println(Arrays.toString((arr)));
    }
}

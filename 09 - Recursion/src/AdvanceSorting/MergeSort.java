package AdvanceSorting;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3, 9};
//        print(arr);
//        mergeSort(arr);
//        print(arr);

//        print(arr);
//        arr = mergeSort(arr);
//        print(arr);

        print(arr);
        mergeSortInPlace(arr, 0, arr.length);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele +  " ");
        }
        System.out.println();
    }

//    public static void mergeSort(int[] arr) {
//        int n = arr.length;
//        if (n == 1) return;   // 1 length array is sorted already
//
//        // Step 1 : Create 2 new Empty arrays of size n / 2 each
//        int[] a = new int[n / 2];
//        int[] b = new int[n - n / 2];
//
//        // Step 2 : Copy-paste arr into a and b
//        int idx = 0; // idx travel on arr
//        for (int i = 0; i < a.length; i++){
//            a[i] = arr[idx++];
//        }
//        for (int i = 0; i < b.length; i++){
//            b[i] = arr[idx++];
//        }
//
//        // Step 3 : Apply recursion on a and b
//        mergeSort(a);
//        mergeSort(b);
//
//        // Step 4 : Merge a and b into arr
//        merge(a, b, arr);
//    }
//
//    public static void merge(int[] a, int[] b, int[] arr) {
//        int i = 0, j = 0, k = 0;
//
//        while (i < a.length && j < b.length) {
//            if (a[i] <= b[j]) {
//                arr[k] = a[i];
//                i++; k++;
//            }
//            else {
//                arr[k] = b[j];
//                j++; k++;
//            }
//        }
//
//        while (i < a.length) {
//            arr[k] = a[i];
//            i++; k++;
//        }
//        while (j < b.length) {
//            arr[k] = b[j];
//            j++; k++;
//        }
//    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < first.length && j < second.length) {
            if (first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while (j < second.length) {
            mix[k] = second[j];
            j++;
            k++;
        }

        return mix;
    }

    public static void mergeSortInPlace(int[] arr, int s, int e) {
        if (e - s == 1) {
            return;
        }

        int mid = (s + e) / 2;

        mergeSortInPlace(arr, s, mid);
        mergeSortInPlace(arr, mid, e);

        mergeInPlace(arr, s, mid, e);
    }

    public static void mergeInPlace(int[] arr, int s, int m, int e) {
        int[] mix = new int[e - s];

        int i = s;
        int j = m;
        int k = 0;

        while (i < m && j < e) {
            if (arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while (i < m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while (j < e) {
            mix[k] = arr[j];
            j++;
            k++;
        }

        for (int l = 0; l < mix.length; l++) {
            arr[s+l] = mix[l];
        }
    }
}

package AdvanceSorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3, 9};
        print(arr);
        mergeSort(arr);
        print(arr);
    }

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele +  " ");
        }
        System.out.println();
    }

    public static void mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) return;   // 1 length array is sorted already

        // Step 1 : Create 2 new Empty arrays of size n / 2 each
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2 : Copy-paste arr into a and b
        int idx = 0; // idx travel on arr
        for (int i = 0; i < a.length; i++){
            a[i] = arr[idx++];
        }
        for (int i = 0; i < b.length; i++){
            b[i] = arr[idx++];
        }

        // Step 3 : Apply recursion on a and b
        mergeSort(a);
        mergeSort(b);

        // Step 4 : Merge a and b into arr
        merge(a, b, arr);
    }

    public static void merge(int[] a, int[] b, int[] arr) {
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                arr[k] = a[i];
                i++; k++;
            }
            else {
                arr[k] = b[j];
                j++; k++;
            }
        }

        while (i < a.length) {
            arr[k] = a[i];
            i++; k++;
        }
        while (j < b.length) {
            arr[k] = b[j];
            j++; k++;
        }
    }
}

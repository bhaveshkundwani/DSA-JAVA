package BasicSortingUsingRecursion;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {3, 92, 94, 29, 34, 85, 1, 48};
        insertionSort(arr, arr.length, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int n, int i) {
        // Base Case
        if (i == n) return;

        int j = i;
        while (j > 0 && arr[j - 1] > arr[j]) {
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;
            j--;
        }

        insertionSort(arr, n, i + 1);

    }
}

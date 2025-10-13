package BasicSortingUsingRecursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 92, 94, 29, 34, 85, 1, 48};
        bubbleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int n) {
        // Base case
        if (n == 1)
            return;

        int count = 0;

        for (int i = 0; i < n-1; i++) {
            if (arr[i] > arr[i + 1]) {
                // swap arr[i], arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }

        //check if any swapping occur or not
        if (count == 0)
            return;

        // Largest element is fixed,
        // recursion for remaining array
        bubbleSort(arr, n-1);
    }
}

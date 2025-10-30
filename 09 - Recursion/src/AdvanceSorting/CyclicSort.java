package AdvanceSorting;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 2, 7, 0, 4, 6};
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        cycleSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    public static void cycleSort(int[] arr){
        int n = arr.length;
        int i = 0;

        while (i < n) {
            if (arr[i] == i) i++;
            else {
                int idx = arr[i];
                swap(arr, i, idx);
            }
        }
    }

    public static void swap(int[] arr, int i, int idx){
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}

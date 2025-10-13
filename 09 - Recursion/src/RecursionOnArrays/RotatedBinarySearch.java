package RecursionOnArrays;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(searchInRotatedArr(arr, 5, 0, arr.length - 1));
    }

    public static int searchInRotatedArr(int[] arr, int target, int st, int end) {
        if (st > end) {
            return -1;
        }

        int mid = st + (end-st) / 2;
        if (arr[mid] == target) {
            return mid;
        }

        if (arr[st] <= arr[mid]) {
            if (arr[st] <= target && target <= arr[mid]) {
                return searchInRotatedArr(arr, target, st, mid-1);
            } else {
                return searchInRotatedArr(arr, target, mid+1, end);
            }
        }

        if (target >= arr[mid] && target <= arr[end]) {
            return searchInRotatedArr(arr, target, mid+1, end);
        }

        return searchInRotatedArr(arr, target, st, mid-1);
    }
}

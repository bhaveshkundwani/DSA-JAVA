package binary_search;

public class CountElement {
    public static void main(String[] args) {
        int[] arr = {10, 10, 10, 10, 10, 10, 10, 10, 18, 20, 22, 43};
        int firstIdx = firstOccurrence(arr, 10);
        int lastIdx = lastOccurrence(arr, 10);

        int count = lastIdx - firstIdx + 1;

        System.out.println(count);
    }

    public static int firstOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int first = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                first = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return first;
    }

    public static int lastOccurrence(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        int last = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == arr[mid]){
                last = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return last;
    }
}

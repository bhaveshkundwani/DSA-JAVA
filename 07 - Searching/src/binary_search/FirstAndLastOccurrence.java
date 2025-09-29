package binary_search;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 10, 10, 18, 20};

        System.out.println("First occurrence index : " + firstOccurrence(arr, 10));
        System.out.println("Last occurrence index : " + lastOccurrence(arr, 10));
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

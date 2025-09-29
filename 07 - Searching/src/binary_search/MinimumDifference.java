package binary_search;

public class MinimumDifference {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 12;

        System.out.println(minDiff(arr, key));
    }

    public static int minDiff(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return arr[mid];
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        if (start >= arr.length) return arr[end];
        if (end < 0) return arr[start];

        // Compare which is closer
        if (Math.abs(arr[start] - target) < Math.abs(arr[end] - target)) {
            return arr[start];
        }
        return arr[end];
    }
}

package binary_search;

public class SearchInBitonic {
    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        int key = 8;
        int max = findPeakEle(arr);
        int ans1 = searchInAscending(arr, key, 0, max - 1);
        int ans2 = searchInDescending(arr, key, max, arr.length - 1);

        if (ans1 > 0)
            System.out.println(ans1);
        if (ans2 > 0)
            System.out.println(ans2);

        if (ans1 == -1 && ans2 == -1){
            System.out.println(-1);
        }
    }

    public static int findPeakEle(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        int max = Integer.MIN_VALUE;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                max = mid;
                break;
            }
            if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return max;
    }

    public static int searchInAscending(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int searchInDescending(int[] arr, int target, int start, int end){

        while (start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

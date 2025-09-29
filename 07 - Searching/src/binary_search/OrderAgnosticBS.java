package binary_search;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         int[] arr = {20, 17, 15, 13, 12, 10, 9, 8, 4};
//        int[] arr = {4};
        int[] arr = {10, 10, 10, 10, 10, 10, 10}; //   O/P : 3
        System.out.println(bs(arr, 10));
    }

    public static int bs(int[] arr, int target){
        if (arr.length == 1){
            if (arr[0] == target) return 0;
            else return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]){
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
        }
        else {
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
        }

        return -1;
    }
}

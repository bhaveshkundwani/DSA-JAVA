package binary_search;

public class FindFirstOne {
    public static void main(String[] args) {
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        int key = 1;
        int start = 0, end = 1;
        while(key > arr[end]){
            start = end;
            end = end * 2;
        }

        System.out.println(first(arr, key, start, end));
    }

    public static int first(int[] arr, int target, int start, int end){
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
}

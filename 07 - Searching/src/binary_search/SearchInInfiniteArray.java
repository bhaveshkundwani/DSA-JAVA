package binary_search;

// binary search on infinite array
public class SearchInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int key = 15;
        int start = 0, end = 1;
        while(key > arr[end]){
            start = end;
            end = end * 2;
        }

        System.out.println(search(arr, key, start, end));
    }

    public static int search(int[] arr, int target, int start, int end){

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
}

package binary_search;

// what is floor ?
// greatest element smaller than or equal to target

public class Floor {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 10, 10, 12, 19};

        System.out.println(floor(arr, 9));
    }

    public static int floor(int[] arr, int ele){
        int start = 0;
        int end = arr.length - 1;

        int res = -1;
        while (start <= end){
            int mid = start + (end - start) / 2;

            if (ele == arr[mid]){
                return arr[mid];
            }
            else if (ele < arr[mid]) {
                end = mid - 1;
            }
            else {
                res = arr[mid];
                start = mid + 1;
            }
        }
        return res;
    }
}

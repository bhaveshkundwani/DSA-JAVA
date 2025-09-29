package binary_search;

// what is ceil ?
// smallest element greater than or equal to target

public class Ceil {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 8, 10, 10, 12, 19};
        System.out.println(ceil(arr, 13));
    }

    public static int ceil(int[] arr, int ele){
//         what if the target is greater than the greatest number in the array
        if (ele > arr[arr.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = arr.length - 1;

        int res = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (ele == arr[mid]){
                return arr[mid];
            }
            if (ele < arr[mid]) {
                res = arr[mid];
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return res;
    }
}

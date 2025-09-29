package binary_search;

public class NearlySorted {
    public static void main(String[] args) {
        int[] arr = {5, 10, 30, 20, 40};

        System.out.println(nearlySorted(arr, 59));
    }

    public static int nearlySorted(int[] arr, int ele){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (ele == arr[mid]){
                return mid;
            } else if (mid - 1 >= start && arr[mid - 1] == ele){
                return mid - 1;
            } else if (mid + 1 <= end && arr[mid + 1] == ele){
                return mid + 1;
            } else if (ele < arr[mid]){
                end = mid - 2;
            } else {
                start = mid + 2;
            }
        }

        return -1;
    }
}

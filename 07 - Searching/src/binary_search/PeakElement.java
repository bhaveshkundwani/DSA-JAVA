package binary_search;

public class PeakElement {
    public static void main(String[] args) {
        int[] arr = {5, 10, 20, 15};
//        System.out.println(peakIndexInMountainArray(arr));
        System.out.println(findPeakEle(arr));
    }

//    public static int peakIndexInMountainArray(int[] arr) {
//        int n = arr.length;
//
//        int start = 1, end = n - 2;
//
//        while(start <= end){
//            int mid = start + (end - start) / 2;
//
//            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//            else if (arr[mid] > arr[mid - 1] && arr[mid] < arr[mid + 1]){
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }

    public static int findPeakEle(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (mid == 0) {
                return (arr[0] >= arr[1]) ? 0 : 1;
            }
            if (mid == arr.length - 1) {
                return (arr[arr.length - 1] >= arr[arr.length - 2]) ? arr.length - 1 : arr.length - 2;
            }

            if (mid > 0 && mid < arr.length - 1){
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                    return mid;
                }
            }
            if (arr[mid - 1] > arr[mid]) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static int findPeakEle1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If mid is less than next element, peak lies on the right
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            }
            // Else peak lies on the left (including mid)
            else {
                end = mid;
            }
        }

        return start;
    }
}

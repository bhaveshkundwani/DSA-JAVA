package binary_search;

public class MaxEleInBitonic {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 8, 12, 4, 2, 1, 0};
        System.out.println(findPeakEle(arr));
    }

    public static int findPeakEle(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        int max = Integer.MIN_VALUE;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]){
                max = arr[mid];
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
}

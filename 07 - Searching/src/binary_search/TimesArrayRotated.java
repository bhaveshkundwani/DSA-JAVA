package binary_search;

public class TimesArrayRotated {
    public static void main(String[] args) {
        int[] arr = {8, 11, 12, 15, 18, 2, 5, 6};

        System.out.println(noOfTimesRotated(arr));
    }

    public static int noOfTimesRotated(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){

            if (arr[start] <= arr[end]) {
                return start;
            }

            int mid = start + (end - start) / 2;

            int next = (mid + 1) % arr.length;
            int prev = (mid + arr.length - 1) % arr.length;

            if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            if (arr[start] <= arr[mid]) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}

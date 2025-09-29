package binary_search;

public class AllocateMinimumPages {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        int ans = allocateMin(arr, 2);
        System.out.println(ans);
    }

    public static int allocateMin(int[] arr, int k){
        int n = arr.length;

        int start = -1;
        int end = 0;
        for (int i = 0; i < n; i++){
            if (arr[i] > start){
                start = arr[i];
            }
            end += arr[i];
        }

        int result = -1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (isValid(arr, n, k, mid)){
                result = mid;
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }

        return result;
    }

    public static boolean isValid(int[] arr, int n, int k, int max){
        int student = 1;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += arr[i];
            if (sum > max){
                student++;
                sum = arr[i];
            }

            if (student > k){
                return false;
            }
        }

        return true;
    }
}

package linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        boolean ans = linearSearch(nums, target);
        int res = linearSearch2(nums, 45);
        System.out.println(ans);
        System.out.println(res);
    }

    // search the target and return true or false
    static boolean linearSearch(int[] arr, int target) {

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }

        return false;
    }

    // search the target and return the index
    static int linearSearch2(int[] arr, int target) {

        // run a for loop
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == target) return i;
        }

        return -1;
    }
}

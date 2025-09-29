package binary_search;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {-1,0,3,5,9,12};
//        int target = -1;
//        int idx = searchInAscending(arr, target);
//        if (idx != -1){
//            System.out.println("Target exists at index : " + idx);
//        } else {
//            System.out.println("Target doesn't exists");
//        }

        int[] arr = {12, 9, 5, 3, 0, -1};
        int target = -1;
        int idx = searchInDescending(arr, target);
        if (idx != -1){
            System.out.println("Target exists at index : " + idx);
        } else {
            System.out.println("Target doesn't exists");
        }
    }

//     return the index
//     return -1 if it does not exist
    public static int searchInAscending(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == nums[mid]){
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static int searchInDescending(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target == nums[mid]){
                return mid;
            } else if (target < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}

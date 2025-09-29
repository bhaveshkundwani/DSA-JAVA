package binary_search;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(search(arr, 7));

        int[] arr1 = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(searchInRotated(arr1, 7));
    }

//  1st method to search element in rotated sorted array
    static int search(int[] nums, int target) {
        int pivot = findPivot(nums);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot == -1) {
            // just do normal binary search
            return binarySearch(nums, target, 0 , nums.length - 1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (nums[pivot] == target) {
            return pivot;
        }

        if (target >= nums[0]) {
            return binarySearch(nums, target, 0, pivot - 1);
        }

        return binarySearch(nums, target, pivot + 1, nums.length - 1);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    // this will not work in duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if (arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }


//  2nd method to search element in rotated sorted array
    public static int searchInRotated(int[] nums, int key){
        int n = nums.length;

        int st = 0, end = n - 1;

        while(st <= end){
            int mid = st + (end - st) / 2;

            if (nums[mid] == key){
                return mid;
            }
            else if (nums[st] <= nums[mid]){
                if (nums[st] <= key && key <= nums[mid]) end = mid - 1;
                else st = mid + 1;
            }
            else {
                if (nums[mid] <= key && key <= nums[end]) st = mid + 1;
                else end = mid - 1;
            }
        }

        return -1;
    }

}

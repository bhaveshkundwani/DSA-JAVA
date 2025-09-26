package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // increasing order bubble sort
        int[] arr = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};

        int n = arr.length;
        for (int i = 0; i < n; i++){
            boolean swapped = false;
            for(int j = 0; j < n - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // if no element were swapped by inner loop, then break
            if(!swapped) break;
        }

        System.out.println(Arrays.toString(arr));


        // decreasing order bubble sort
        int[] nums = {2, 7, 1, 73, 98, 74, 28, 75, 92, 57, 82};

        int n1 = nums.length;
        for (int i = 0; i < n1; i++){
            boolean swap = false;
            for (int j = 0; j < n1 - i - 1; j++){
                if(nums[j] < nums[j + 1]){
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    swap = true;
                }
            }
            // if no element were swapped by inner loop, then break
            if(!swap) break;
        }

        System.out.println(Arrays.toString(nums));
    }
}

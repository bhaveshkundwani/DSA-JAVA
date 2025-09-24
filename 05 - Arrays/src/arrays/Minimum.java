package arrays;

// Print the minimum element in the array (smallest element in the array)
public class Minimum {
    public static void main(String[] args) {
        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10, -10};

        int min = Integer.MAX_VALUE;
        for(int val : arr){
            if (val < min){
                min = val;
            }
        }

        System.out.println(min);
    }
}

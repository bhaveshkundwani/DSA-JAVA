package arrays;


// Print the Maximum element in the array (largest element in the Array)
public class Maximum {
    public static void main(String[] args) {
        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};

        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if (val > max){
                max = val;
            }
        }

        System.out.println(max);
    }
}

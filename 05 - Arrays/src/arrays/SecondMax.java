package arrays;

// Print the second Maximum element in the array
public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {-6, 8, 14, -2, 23, 47, 4, 3, 10};

        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if (val > max){
                max = val;
            }
        }

        int secMax = Integer.MIN_VALUE;
        for (int num : arr){
            if(num > secMax && num != max){
                secMax = num;
            }
        }

        System.out.println(max);
        System.out.println(secMax);
    }
}

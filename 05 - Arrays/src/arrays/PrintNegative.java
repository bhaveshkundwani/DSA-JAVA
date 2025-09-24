package arrays;


//Given an Array, print negative elements only
public class PrintNegative {
    public static void main(String[] args) {
        int[] arr = {-2, -4, 83, 75, 28, -9, 84, -75, -822, -98, 874, 82, -85};

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < 0){
                System.out.print(arr[i] + " ");
            }
        }
    }
}

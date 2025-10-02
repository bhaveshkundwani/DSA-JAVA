package MultiDimensionalArray;

// find the row with the maximum sum
public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 4, 1, 8, 9},
                {5, 7, 8, 2, 9},
                {3, 9, 7, 6, 8}
        };

        int maxSum = Integer.MIN_VALUE;
        int rowNum = -1;
        for (int i = 0; i < arr.length; i++){
            int sum = 0;
            for (int j = 0; j < arr[0].length; j++){
                sum += arr[i][j];
            }
            if (sum > maxSum){
                maxSum = sum;
                rowNum = i;
            }
        }

        System.out.println("Max row sum = " + maxSum);
        System.out.println("Row no that have the max sum = " + rowNum);

    }
}

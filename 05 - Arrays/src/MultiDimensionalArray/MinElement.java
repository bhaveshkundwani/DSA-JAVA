package MultiDimensionalArray;


// find the minimum element out of all the maximum elements of each row

public class MinElement {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 9, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        int minEle = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++){
            int max = Integer.MIN_VALUE;
            for (int j = 0; j < arr[0].length; j++){
                int currEle = arr[i][j];
                max = Math.max(currEle, max);
            }
            minEle = Math.min(max, minEle);
        }

        System.out.println(minEle);
    }
}

package MultiDimensionalArray;

public class SnakePrintColWise {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 9, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        for (int i = 0; i < arr[0].length; i++){
            if (i % 2 == 0){
                for (int j = 0; j < arr.length; j++){
                    System.out.print(arr[j][i] + " ");
                }
            }
            else {
                for (int j = arr.length - 1; j >= 0; j--){
                    System.out.print(arr[j][i] + " ");
                }
            }
        }
    }
}

package MultiDimensionalArray;

public class ReverseAllRowsAndCols {
    public static void main(String[] args) {
        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 9, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        System.out.println("Original:");
        printMatrix(arr);

        reverseRows(arr);
        reverseCols(arr);

        System.out.println("Final:");
        printMatrix(arr);
    }

    // Function to reverse rows
    static void reverseRows(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int left = 0, right = mat[i].length - 1;
            while (left < right) {
                int temp = mat[i][left];
                mat[i][left] = mat[i][right];
                mat[i][right] = temp;
                left++;
                right--;
            }
        }
    }

    // Function to reverse columns
    static void reverseCols(int[][] mat) {
        int top = 0, bottom = mat.length - 1;
        while (top < bottom) {
            for (int col = 0; col < mat[0].length; col++) {
                int temp = mat[top][col];
                mat[top][col] = mat[bottom][col];
                mat[bottom][col] = temp;
            }
            top++;
            bottom--;
        }
    }

    // Print matrix
    static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}

package binary_search;

public class SearchInMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}
        };

        int[] ans = matSearch(mat, 23, 4, 4);
        for (int val : ans){
            System.out.print(val + " ");
        }
    }

    public static int[] matSearch(int[][] arr, int key, int n, int m){
        int[] ans = new int[2];
        int i = 0;
        int j = m - 1;

        while (i >= 0 && i < n && j >= 0 && j < m){
            if (arr[i][j] == key){
                ans[0] = i;
                ans[1] = j;
                return ans;
            } else if (arr[i][j] > key) {
                j--;
            }
            else {
                i++;
            }
        }

        return new int[]{-1, -1};
    }
}

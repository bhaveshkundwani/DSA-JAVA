package RecursionOnArrays;

public class Sorted {
    public static void main(String[] args) {
        int[] arr = {3, 7, 9, 10, 6, 92, 100};
        System.out.println(sorted(arr, 0));
    }

    public static boolean sorted(int[] arr, int idx) {
        // base condition
        if (idx == arr.length - 1) {
            return true;
        }

        return arr[idx] < arr[idx + 1] && sorted(arr, idx + 1);
    }
}

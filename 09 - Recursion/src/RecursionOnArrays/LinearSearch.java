package RecursionOnArrays;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {23, 12, 84, 74, 81, 38, 89, 29, 75, 10, 90, 73, 19};

        System.out.println(linearSearch(arr, 79, 0));

        System.out.println(linearSearchIdx(arr, 79, 0));
    }

    public static boolean linearSearch(int[] arr, int target, int idx){
        if (idx == arr.length) return false;

        if (arr[idx] == target) return true;
        return linearSearch(arr, target, idx + 1);
    }

    public static int linearSearchIdx(int[] arr, int target, int idx){
        if (idx == arr.length) return -1;

        if (arr[idx] == target) return idx;
        return linearSearchIdx(arr, target, idx + 1);
    }
}

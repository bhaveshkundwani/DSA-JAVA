package RecursionOnArrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 7, 10, 18, 20, 23, 25, 70, 99};
        int target = 7;
        System.out.println(search(arr, target, 0, arr.length-1));
    }

    public static int search(int[] arr, int target, int st, int end){
        if (st > end) return -1;

        int mid = st + (end - st) / 2;
        if (arr[mid] == target) return mid;
        else if (arr[mid] > target) return search(arr, target, st, mid - 1);
        else return search(arr, target, mid + 1, end);
    }
}

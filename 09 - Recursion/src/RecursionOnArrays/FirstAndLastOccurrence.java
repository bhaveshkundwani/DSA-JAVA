package RecursionOnArrays;

public class FirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 10, 10, 18, 20};

        System.out.println("First occurrence index : " + firstOccurrence(arr, 10, 0, arr.length - 1));
        System.out.println("Last occurrence index : " + lastOccurrence(arr, 10, 0, arr.length - 1));
    }

    public static int firstOccurrence(int[] arr, int target, int st, int end){
        if (st > end) return st;

        int mid = st + (end - st) / 2;

        if (arr[mid] == target) {
            return firstOccurrence(arr, target, st, mid - 1);
        }
        else if (arr[mid] > target) return firstOccurrence(arr, target, st, mid - 1);
        else return firstOccurrence(arr, target, mid + 1, end);
    }

    public static int lastOccurrence(int[] arr, int target, int st, int end){
        if (st > end) return end;

        int mid = st + (end - st) / 2;

        if (arr[mid] == target) {
            return lastOccurrence(arr, target, mid + 1, end);
        }
        else if (arr[mid] > target) return lastOccurrence(arr, target, st, mid - 1);
        else return lastOccurrence(arr, target, mid + 1, end);
    }
}

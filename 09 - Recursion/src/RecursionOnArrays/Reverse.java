package RecursionOnArrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 34, 19, 94, 29, 18, 20};
        revese(arr, 0, arr.length - 1);
        for (int ele : arr){
            System.out.print(ele + " ");
        }
    }

    public static void revese(int[] arr, int st, int end){
        if (st > end) return;

        int temp = arr[st];
        arr[st] = arr[end];
        arr[end] = temp;

        revese(arr, st+1, end-1);
    }
}

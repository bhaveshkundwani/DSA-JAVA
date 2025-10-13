package RecursionOnArrays;

public class PrintElements {
    public static void main(String[] args) {
        int[] arr = {23, 82, 84, 82, 81, 38, 89, 29, 75, 10};
//        recursivePrint(arr, 0);

        recursivePrintReverseOrder(arr, 0);
    }

//    public static void recursivePrint(int[] arr, int idx){
//        if (idx == arr.length) return;
//
//        System.out.print(arr[idx] + " ");
//        recursivePrint(arr, idx+1);
//    }

    public static void recursivePrintReverseOrder(int[] arr, int idx){
        if (idx == arr.length) return;

        recursivePrintReverseOrder(arr, idx+1);
        System.out.print(arr[idx] + " ");
    }
}

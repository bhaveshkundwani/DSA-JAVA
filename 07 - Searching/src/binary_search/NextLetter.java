package binary_search;

public class NextLetter {
    public static void main(String[] args) {
        char[] arr = {'a', 'c', 'f', 'h'};

        System.out.println(nextLetter(arr, 'h'));
    }

    public static char nextLetter(char[] arr, char key){
        char res = '#';

        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (arr[mid] == key){
                start = mid + 1;
            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                res = arr[mid];
                end = mid - 1;
            }
        }

        return res;
    }
}

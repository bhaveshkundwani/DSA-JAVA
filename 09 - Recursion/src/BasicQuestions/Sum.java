package BasicQuestions;

public class Sum {
    public static void main(String[] args) {
        int n = 10;

        System.out.println(findSum(n));
    }

    public static int findSum(int n){
        if (n == 1) return 1;
        return n + findSum(n - 1);
    }
}

package BasicQuestions;

public class Finonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    public static int fibo(int n){
        if (n == 0 || n == 1) return n;

        return fibo(n-1) + fibo(n - 2);
    }
}

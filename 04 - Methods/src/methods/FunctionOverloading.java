package methods;

public class FunctionOverloading {
    public static void main(String[] args) {
        int result1 = sum(10, 20);
        System.out.println("Sum = " + result1);

        int result2 = sum(23, 20, 34);
        System.out.println("Sum = " + result2);

        int result3 = sum(10, 20, 50, 70);
        System.out.println("Sum = " + result3);
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int sum(int a, int b, int c){
        return a + b + c;
    }

    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
}

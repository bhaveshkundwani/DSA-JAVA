package methods;


// print all the 3 digit armstrong numbers
public class Armstrong {
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // function to check if the number is armstrong or not
    static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }

        return sum == original;
    }
}

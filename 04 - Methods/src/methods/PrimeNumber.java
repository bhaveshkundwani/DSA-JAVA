package methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int num = sc.nextInt();
        boolean ans = isPrime(num);

        if(ans) {
            System.out.println("prime");
        } else {
            System.out.println("Not Prime");
        }
    }

    static boolean isPrime(int n){
        if (n <= 1){
            return false;
        }

        for (int i = 2; i * i <= n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}

package methods;

import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
//        Write a function that returns the sum of first n natural numbers.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = naturalNumbersSum(n);
        System.out.println(ans);
    }

    static int naturalNumbersSum(int num){
        // 1st way
//        int sum = 0;
//        for (int i = 1; i <= num; i++){
//            sum += i;
//        }
//        return sum;

//        2nd way - using formula
        return (num * (num + 1) / 2);
    }
}

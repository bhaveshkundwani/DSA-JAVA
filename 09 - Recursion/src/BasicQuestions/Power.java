package BasicQuestions;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base : ");
        int a = sc.nextInt();
        System.out.print("Enter Power : ");
        int b = sc.nextInt();
//        System.out.println(a + " raised to the power " + b + " is " + powerLinear(a, b));

        System.out.println(a + " raised to the power " + b + " is = " + powerLog(a, b));
    }


//    public static int powerLinear(int a, int b){
//        if (b == 0) return 1;
//        return a * powerLinear(a, b - 1);
//    }

    public static int powerLog(int a, int b){
        if (b == 0) return 1;
        int result = powerLog(a, b/2);

        if (b % 2 == 0) return result * result;
        else return a * result * result;
    }
}

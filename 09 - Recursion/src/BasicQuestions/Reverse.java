package BasicQuestions;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();

//        rev(n, 0);

        System.out.println(rev(n, 0));
    }

//    with void return type
//    public static void rev(int n, int r){
//        if (n == 0){
//            System.out.println(r);
//            return;
//        }
//
//        rev(n / 10, r * 10 + n % 10);
//    }


//    with int return type
    public static int rev(int n, int r){
        if (n == 0) return r;
        return rev(n / 10, r * 10 + n % 10);
    }
}

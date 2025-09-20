package loops;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number : ");
        int n = sc.nextInt();

//        1st way to solve
//        boolean flag = true;
//        for (int i = 2; i < n; i++){
//            if(n % i == 0){
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag){
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not prime");
//        }


//        2nd way to solve
//        boolean flag = true;
//        for (int i = 2; i <= n / 2; i++){
//            if(n % i == 0){
//                flag = false;
//                break;
//            }
//        }
//
//        if (flag){
//            System.out.println("Prime");
//        } else {
//            System.out.println("Not prime");
//        }

//        3rd way to solve
        boolean flag = true;
        for (int i = 2; i * i <= n; i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }

        if (flag){
            System.out.println("Prime");
        } else {
            System.out.println("Not prime");
        }

    }
}

package pattern_printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

//        Method - 1
//        for (int i = 1; i <= n; i++) {
//            for(int j = 1; j <= n - i; j++){ // spaces
//                System.out.print("  ");
//            }
//
//            for(int j = 1; j <= 2 * i - 1; j++){ // stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//        Method - 2
        int no_of_spaces = n - 1;
        int no_of_stars = 1;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= no_of_spaces; j++){ // spaces
                System.out.print("  ");
            }

            for(int j = 1; j <= no_of_stars; j++){ // stars
                System.out.print("* ");
            }
            no_of_spaces--;
            no_of_stars += 2;
            System.out.println();
        }

    }
}

package pattern_printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int j = 1; j <= 2 * n - 1; j++){
            System.out.print("* ");
        }
        System.out.println();

        int no_of_spaces = 1;
        for (int i = 1; i <= n - 1; i++) {
            for(int j = 1; j <= n - i; j++){
                System.out.print("* ");
            }

            for(int j = 1; j <= no_of_spaces; j++){
                System.out.print("  ");
            }

            for(int j = 1; j <= n - i; j++){
                System.out.print("* ");
            }

            no_of_spaces += 2;
            System.out.println();
        }
    }
}

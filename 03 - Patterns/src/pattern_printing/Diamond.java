package pattern_printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

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

        no_of_spaces = 1;
        no_of_stars = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= no_of_spaces; j++){ // spaces
                System.out.print("  ");
            }

            for(int j = 1; j <= no_of_stars; j++){ // stars
                System.out.print("* ");
            }
            no_of_spaces++;
            no_of_stars -= 2;
            System.out.println();
        }
    }
}

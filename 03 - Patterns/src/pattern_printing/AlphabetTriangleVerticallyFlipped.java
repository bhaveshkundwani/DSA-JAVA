package pattern_printing;

import java.util.Scanner;

public class AlphabetTriangleVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for(int j = 1; j <= n - i; j++){ // spaces
                System.out.print("  ");
            }

            for(int j = 1; j <= i; j++){ // stars
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}

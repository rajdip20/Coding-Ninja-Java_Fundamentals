/*
Print the following pattern
Pattern for N = 4

       *
      *** 
     *****
    *******
*/

import java.util.Scanner;

public class Star_Pattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int space = n - 1;
        int i = 1;
        while (i <= n) {
            int j = 1;
            space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }
            while (j <= ((2 * i) - 1)) {
                System.out.print("*");
                j += 1;
            }
            System.out.println("");
            i += 1;
        }

    }

}

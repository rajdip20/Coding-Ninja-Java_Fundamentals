/*
Print the following pattern for the given N number of rows.
Pattern for N = 4

      1
    1 2
  1 2 3
1 2 3 4
*/

import java.util.*;

public class Mirror_Image_Number_Pattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 1;
        for (int i = n; i > 0; i--) {
            for (int j = 1; j < i; j++)
                System.out.print(" ");
            for (int j = 1; j <= count; j++) {
                System.out.print(j);
            }
            System.out.println();
            count++;
        }

    }
}

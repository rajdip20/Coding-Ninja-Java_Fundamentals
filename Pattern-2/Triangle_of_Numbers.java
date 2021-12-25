/*
Print the following pattern for the given number of rows.
Pattern for N = 4

       1
      232
     34543
    4567654
*/

import java.util.*;

public class Triangle_of_Numbers {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, num = 1, gap;

        gap = n - 1;

        for (j = 1; j <= n; j++) {
            num = j;

            for (i = 1; i <= gap; i++)
                System.out.print(" ");

            gap--;

            for (i = 1; i <= j; i++) {
                System.out.print(num);
                num++;
            }
            num--;
            num--;
            for (i = 1; i < j; i++) {
                System.out.print(num);
                num--;
            }
            System.out.println();
        }

    }

}

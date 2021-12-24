/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
4444
4444
4444
4444
*/

import java.util.*;

public class Squre_Pattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(N);
            }
            System.out.println("");
        }

    }
}

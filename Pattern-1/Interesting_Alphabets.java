/*
Print the following pattern for the given number of rows.
Pattern for N = 5
E
DE
CDE
BCDE
ABCDE
*/

import java.util.*;

public class Interesting_Alphabets {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m;
        char c = (char) (65 + N);
        for (int i = 1; i <= N; i++) {
            c = (char) (c - i);
            for (int j = 0; j < i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println("");
        }

    }
}

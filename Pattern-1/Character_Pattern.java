/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
A
BC
CDE
DEFG
*/

import java.util.*;

public class Character_Pattern {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int m;
        char c;
        for (int i = 1; i <= N; i++) {
            m = 64 + i;
            c = (char) m;
            for (int j = 0; j < i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.println("");
        }

    }
}

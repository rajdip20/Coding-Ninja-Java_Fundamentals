/*
Write a program to print parallelogram pattern for the given N number of rows.
For N = 4
****
 ****
  ****
   ****
*/

import java.util.*;

public class Parallelogram_Pattern {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++)
        {
            for (int j = 2; j <= i; j++)
            {
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}

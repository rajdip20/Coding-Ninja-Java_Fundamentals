/*
Write a program to print all the factors of a number other than 1 and the number itself.
*/

import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
        for (i = 2; i <= n; i++) {
            if (n % i == 0) {
                if (i != n) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}

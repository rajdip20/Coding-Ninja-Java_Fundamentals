//Write a program to print multiplication table of n

import java.util.Scanner;
public class Multiplication_Table {
    public static void main(String[] args) {
        // Write your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(i * n);
        }

    }
}

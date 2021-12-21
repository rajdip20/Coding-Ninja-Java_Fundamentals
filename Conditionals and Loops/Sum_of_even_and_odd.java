/*
Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.

Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
    Integer N
*/

import java.util.Scanner;
public class Sum_of_even_and_odd {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum = 0, oddsum = 0;
        while (n != 0) {
            int temp = n % 10;
            if (temp % 2 == 0) {
                evensum += temp;
            }
            if (temp % 2 != 0) {
                oddsum += temp;
            }
            n = (int) (n / 10);
        }
        System.out.println(evensum + " " + oddsum);

    }
}

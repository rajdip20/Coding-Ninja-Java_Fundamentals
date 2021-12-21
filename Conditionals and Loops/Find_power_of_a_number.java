/*
Write a program to find x to the power n (i.e. x^n). 
Take x and n from the user. You need to print the answer.

Note : For this question, you can assume that 0 raised to the power of 0 is 1
*/

import java.util.Scanner;
public class Find_power_of_a_number {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int temp = 1;
        int n = sc.nextInt();

        while (n != 0) {
            temp = temp * x;
            n--;
        }

        System.out.println(temp);
    }
}

/*
Given a binary number as an integer N, convert it into decimal and print.
*/

import java.util.*;

public class Binary_to_decimal {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int dec_value = 0;
        int base = 1;
        int temp = num;
        
        while (temp > 0) 
        {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * 2;
        }

        System.out.println(dec_value);

    }
}

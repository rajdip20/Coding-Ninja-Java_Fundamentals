/*
Given a decimal number (integer N), convert it into binary and print.
The binary number should be in the form of an integer.
*/

import java.util.*;

public class Decimal_to_Binary {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] binaryNum = new int[32];
        int i = 0;
        if(n==0)
        {
            System.out.println(0);
        }
        
        while (n > 0) 
        {
            binaryNum[i] = n % 2;
            n = n / 2;
            i++;
        }
 
        for (int j = i - 1; j >= 0; j--)
        {
            System.out.print(binaryNum[j]);
        }

    }
}

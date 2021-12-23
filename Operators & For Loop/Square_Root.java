/*
Given a number N, find its square root. You need to find and print only the integral part of square root of N.
For eg. if number given is 18, answer is 4.
*/

import java.util.*;

public class Square_Root {
    
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        if (x == 0 || x == 1)
        {
            System.out.println(x);
        }
        else
        {
            int i = 1, result = 1;
            
            while (result <= x)
            {
                i++;
                result = i * i;
            }
        
            System.out.println(i - 1);
        }

    }
    
}

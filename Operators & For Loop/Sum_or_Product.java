/*
Write a program that asks the user for a number N and a choice C. 
And then give them the possibility to choose between computing the sum and computing the product of all integers in the range 1 to N (both inclusive).

If C is equal to -
 1, then print the sum
 2, then print the product
 Any other number, then print '-1' (without the quotes)
*/

import java.util.*;

public class Sum_or_Product {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int C = sc.nextInt();
        int i,sum = 0, pro = 1;
        
        switch(C)
        {
            case 1:
                for(i=0;i<=N;i++)
                {
                    sum = sum + i;
                }
                System.out.println(sum);
                break;
                
            case 2:
                for(i=1;i<=N;i++)
                {
                    pro = pro*i;
                }
                System.out.println(pro);
                break;
                
            default:
                System.out.println(-1);
                break;
        }

	}
}

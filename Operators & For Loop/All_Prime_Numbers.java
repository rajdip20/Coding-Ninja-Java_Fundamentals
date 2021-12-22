/*
Given an integer N, print all the prime numbers that lie in the range 2 to N (both inclusive).
Print the prime numbers in different lines.
*/

import java.util.*;

public class All_Prime_Numbers {
    public static void main(String[] args) {

        /* Your class should be named Solution.
        * Read input as specified in the question.
        * Print output as specified in the question.
        */
        int i, number, count; 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(number = 1; number <= n; number++)
        {
            count = 0;
            for (i = 2; i <= number/2; i++)
            {
                if(number % i == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                System.out.print(number+"\n");
            }
        }

    }
}

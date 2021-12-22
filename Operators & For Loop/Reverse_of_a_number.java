/*
Write a program to generate the reverse of a given number N. 
Print the corresponding reverse number.

Note : If a number has trailing zeros, then its reverse will not include them. 
For e.g., reverse of 10400 will be 401 instead of 00401.
*/

import java.util.*;

public class Reverse_of_a_number {
    
    public static void main(String[] args) {
        // Write your code here
        int d, number,temp, revnum = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        temp = number;
        
        while (temp >0) 
        {
            d = temp %10;
            revnum = (revnum*10)+d;
            temp = temp/10;
        }
        
        System.out.println(revnum);

    }
}

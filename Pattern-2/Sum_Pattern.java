/*
Write a program to print triangle of user defined integers sum.
*/

import java.util.*;

public class Sum_Pattern {
    
    public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i, j, num;
        
    	for(i=1; i<=n; i++)
    	{
        	num=1;
        	int sum=0;
        	for(j=1; j<=i; j++)
        	{
            	System.out.print(num+ "");
                sum=sum+num;
            	if (num<i) 
                {
                	System.out.print("+");
                }
                
            	num++;
        	}
            System.out.print("="+sum);
            System.out.println();
        }
        
	}
}

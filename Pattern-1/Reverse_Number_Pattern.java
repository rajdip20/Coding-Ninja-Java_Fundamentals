/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
1
21
321
4321
*/

import java.util.*;

public class Reverse_Number_Pattern {
    public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
        Scanner sc= new Scanner(System.in);
        int N = sc.nextInt();
        int m;
        for(int i=1;i<=N;i++)
        {
            m=i;
            for(int j=0;j<i;j++)
            {
                System.out.print(m);
                m--;
            }   
        	System.out.println("");
        }
    }
}

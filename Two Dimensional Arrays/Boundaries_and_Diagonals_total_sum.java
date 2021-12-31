/*
For a given two-dimensional square matrix of size (N x N).
Find the total sum of elements on both the diagonals and at all the four boundaries.
*/

public class Boundaries_and_Diagonals_total_sum {

    public static void totalSum(int[][] mat) {
        //Your code goes here
        int horizontal=mat.length-1;
        if (horizontal==-1)
        {
            System.out.println(0);
            System.exit(0);
        }


        int vertically=mat[0].length-1;
        int sum=0;
        for (int i = 0; i < mat.length; i++)
        {
            for (int j = 0; j < mat[i].length; j++)
            {
                if (i==0 | j==0 | i==horizontal | j==vertically |i==j | j==horizontal-i)
                {
                    sum+=mat[i][j];
                }
            }
        }
        System.out.print(sum);
    }

}

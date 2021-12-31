/*
For a given two-dimensional integer array/list of size (N x M), print the array/list in a sine wave order, 
i.e, print the first column top to bottom, next column bottom to top and so on.
*/

public class Print_Like_a_Wave {

    public static void wavePrint(int mat[][]){
        //Your code goes here
        if (mat.length==0)
            System.exit(0);
        int p=mat[0].length-1;
        for (int j = 0; j < mat[0].length ; j++)
        {
            for (int i = 0; i < mat.length; i++)
            {
                System.out.print(mat[i][j]+" ");
            }
            j++;
            if (j==mat[0].length)
                System.exit(0);
            for (int i = mat.length-1; i >= 0; i--)
            {
                System.out.print(mat[i][j]+" ");
            }
        }
    }

}

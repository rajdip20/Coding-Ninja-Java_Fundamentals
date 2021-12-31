/*
For a given two-dimensional integer array/list of size (N x M), print it in a spiral form.
That is, you need to print in the order followed for every iteration:

    a. First row(left to right)
    b. Last column(top to bottom)
    c. Last row(right to left)
    d. First column(bottom to top)
*/

public class Print_Spiral {

    public static void spiralPrint(int matrix[][]){
        //Your code goes here
        if (matrix.length!=0)
        {
            int x = matrix[0].length;
            int y = matrix.length;
            for (int i = 0; i < x / 2+1; i++)
            {
                for (int j = i; j < x - i; j++)
                {
                    System.out.print(matrix[i][j] + " ");
                }
                for (int j = i + 1; j < y - i; j++)
                {
                    System.out.print(matrix[j][x - 1 - i] + " ");
                }
                for (int j = x - 2 - i; j >= i; j--)
                {
                    System.out.print(matrix[y - 1 - i][j] + " ");
                }
                for (int j = y - 2 - i; j >= i + 1; j--)
                {
                    System.out.print(matrix[j][i] + " ");
                }
            }
        }
    }
}

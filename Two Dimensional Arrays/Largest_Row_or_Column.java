/*
For a given two-dimensional integer array/list of size (N x M), 
you need to find out which row or column has the largest sum(sum of all the elements in a row/column) amongst all the rows and columns.
*/

public class Largest_Row_or_Column {

    public static void findLargest(int mat[][]){
        //Your code goes here
        int Lrow=Integer.MIN_VALUE;
        int Lcol=Integer.MIN_VALUE;
        int C_index=0;
        int R_index=0;

        if (mat.length>0)
        {
            for (int i = 0; i < mat.length; i++)
            {
                int sum=0;
                for(int ele:mat[i])
                    sum+=ele;
                if (Lrow<sum)
                {
                    Lrow = sum;
                    R_index=i;
                }
            }
            
            for (int i = 0; i < mat[0].length; i++)
            {
                int sum=0;
                for (int j = 0; j < mat.length; j++)
                {
                    sum+=mat[j][i];
                }
                if (Lcol<sum)
                {
                    Lcol = sum;
                    C_index=i;
                }
            }
        }
        if (Lrow>=Lcol)
            System.out.println("row "+R_index+" "+Lrow);
        else
            System.out.println("column "+C_index+" "+Lcol);
	}

}

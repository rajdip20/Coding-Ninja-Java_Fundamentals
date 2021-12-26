/*
You have been given an integer array/list(ARR) of size N. Where N is equal to [2M + 1].\

Now, in the given array/list, 'M' numbers are present twice and one number is present only once.

You need to find and return that number which is unique in the array/list.
*/

public class Find_Unique {
    public static int findUnique(int[] arr){
        //Your code goes here
        for (int i = 0; i < arr.length; i++) 
        {
            int jg=-1;
            for (int j = 0; j < arr.length; j++) 
            {
                    if (arr[i]==arr[j])
                    {
                        jg++;
                    }
            }
            if (jg==0)
            {
                return arr[i];
            }
                    
            
        }
        return arr[0];
    }
}

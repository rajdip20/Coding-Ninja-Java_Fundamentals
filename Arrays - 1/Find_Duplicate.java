/*
You have been given an integer array/list(ARR) of size N which contains numbers from 0 to (N - 2). 
Each number is present at least once. That is, if N = 5, the array/list constitutes values ranging from 0 to 3 and among these, 
there is a single integer value that is present twice. You need to find and return that duplicate number present in the array.
*/

public class Find_Duplicate {
    public static int duplicateNumber(int arr[]) {
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
            if (jg>0)
                return arr[i];
        }
        return 0;
    }
}

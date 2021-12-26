/*
You have been given an integer array/list(ARR) and a number X. 
Find and return the total number of pairs in the array/list which sum to X.
*/

public class Pair_Sum {
    public static int pairSum(int arr[], int x) {
        //Your code goes here
        int count=0;
        for (int i = 0; i < arr.length; i++) 
        {

            for (int j = i; j < arr.length; j++) 
            {
                if (i!=j && ((arr[i]+arr[j])==x)){
                    count++;
                }
            }
        }
        return count;
    }
}

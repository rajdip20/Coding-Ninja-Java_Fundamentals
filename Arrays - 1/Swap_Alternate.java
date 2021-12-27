/*
You have been given an array/list(ARR) of size N. 
You need to swap every pair of alternate elements in the array/list.

You don't need to print or return anything, just change in the input array itself.
*/

public class Swap_Alternate {
    public static void swapAlternate(int arr[]) {
        //Your code goes here
        for(int i = 0; i < arr.length-1; i+=2) 
        {
            int jj=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=jj;
        }
    }
}

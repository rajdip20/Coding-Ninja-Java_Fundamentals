/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
Write a function to sort this array/list. 
Think of a solution which scans the array/list only once and don't require use of an extra array/list.
*/

public class Sort_0_1 {
    public static void sortZeroesAndOne(int[] arr) {
        //Your code goes here
        int count0=0;
        for(int i : arr) {
            if(i==0) {
                count0++;
            }
        }
        for(int i=0;i<count0;i++) {
            arr[i]=0;
        }
        for(int i=count0;i<arr.length;i++) {
            arr[i]=1;
        }
    }
}

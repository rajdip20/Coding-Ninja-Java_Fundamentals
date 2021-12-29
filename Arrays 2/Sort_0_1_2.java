/*
You are given an integer array/list(ARR) of size N. It contains only 0s, 1s and 2s.
Write a solution to sort this array/list in a 'single scan'.

'Single Scan' refers to iterating over the array/list just once or to put it in other words,
you will be visiting each element in the array/list just once.
*/

public class Sort_0_1_2 {
    
    public static void sort012(int[] arr){
        int zero=0;
        int one=0;
        // int two=0;
        for (int ele:arr)
        {
            if (ele==0)
            {
                zero++;
            }
            else if
            {
                (ele==1)one++;
            }
            // else if (ele==2)two++;
        }
        int two=arr.length-zero-one; //Another Way to Get Two
        for (int i = arr.length-two; i <arr.length ; i++)
        {
            arr[i]=2;
        }
        for (int i = arr.length-two-one; i <arr.length-two ; i++)
        {
            arr[i]=1;
        }
        for (int i = 0; i <zero ; i++)
        {
            arr[i]=0;
        }
    
    }
}

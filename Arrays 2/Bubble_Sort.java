/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Bubble Sort'.
 Note:
    Change in the input array/list itself. You don't need to return or print the elements.
*/

public class Bubble_Sort {
    
    public static void bubbleSort(int[] arr){
        //Your code goes here
        for (int i = 0; i < arr.length-1; i++)
        {

            for (int j = 0; j < arr.length - i-1; j++)
            {
                if (arr[j]>arr[j+1])
                {
                    int f1=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=f1;
                }
            }
        }
    }
}

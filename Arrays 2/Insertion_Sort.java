/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Insertion Sort'.
 Note:
    Change in the input array/list itself. You don't need to return or print the elements.
*/

public class Insertion_Sort {
    
    public static void insertionSort(int[] arr) {
        //Your code goes here
        int i = 1;
        int temp;
        while(i < arr.length)
        {
            temp = arr[i];
            int j = i - 1;
            while(j >= 0)
            {
                if(arr[j] > temp)
                {
                    arr[j + 1] = arr[j];
                }
                else
                {
                    break;
                }
                j -= 1;
            }
            arr[j + 1] = temp; i += 1;
        }
    }
}

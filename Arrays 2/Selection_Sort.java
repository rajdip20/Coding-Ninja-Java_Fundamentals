/*
Provided with a random integer array/list(ARR) of size N, you have been required to sort this array using 'Selection Sort'.
 Note:
    Change in the input array/list itself. You don't need to return or print the elements.
*/

public class Selection_Sort {

    public static void selectionSort(int[] arr) {
        //Your code goes here
        int index;
        for(int i=0;i<arr.length-1;i++) 
        {
            index=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[index]) 
                {
                    index=j;
                }
            }

            int save=arr[i];
            arr[i]=arr[index];
            arr[index]=save;
        }
    }
}

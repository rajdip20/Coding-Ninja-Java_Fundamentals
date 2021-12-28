/*
You have been given two sorted arrays/lists(ARR1 and ARR2) of size N and M respectively,
merge them into a third array/list such that the third array is also sorted.
*/

public class Merge_Two_Sorted_Arrays {

    public static int[] merge(int arr1[], int arr2[]) {
        //Your code goes here
        int[] ans = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0; 
        while(i < arr1.length && j < arr2.length)
        {
            if(arr1[i] < arr2[j])
            {
                ans[k] = arr1[i]; k += 1; i += 1;
            }
            else
            {
                ans[k] = arr2[j]; k += 1; j += 1;
            }
        }
        while(i < arr1.length)
        {
            ans[k] = arr1[i]; k += 1; i += 1;
        }
        while(j < arr2.length)
        {
            ans[k] = arr2[j]; k += 1; j += 1;
        }
        return ans;
    }

}

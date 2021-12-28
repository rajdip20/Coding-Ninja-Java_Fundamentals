/*
You have been given a sorted(in ascending order) integer array/list(ARR) of size N and an element X.
Write a function to search this element in the given input array/list using 'Binary Search'.
Return the index of the element in the input array/list.
In case the element is not present in the array/list, then return -1.
*/

public class Binary_Search {
    public static int binarySearch(int[] arr, int x) {
        //Your code goes here
        int start = 0;
        int end = arr.length - 1;
        int mid = start;
        while(start <= end)
        {
            mid = start + (end - start) / 2; if (arr[mid] > x)
            {
                end = mid - 1;
            }
            else if
                (arr[mid] < x)
            {
                start = mid + 1;
            }
            else
            {
                return mid;

            }
        }
        return -1;
    }
}
/*
You have been given a random integer array/list(ARR) of size N.
You are required to find and return the second largest element present in the array/list.

If N <= 1 or all the elements are same in the array/list then return -2147483648 or -2 ^ 31(It is the smallest value for the range of Integer)
*/

public class Second_Largest_in_array {

    public static int secondLargestElement(int[] arr) {
        int FirstL = Integer.MIN_VALUE;
        int SecL = Integer.MIN_VALUE;
        for (int a : arr)
        {
            if (FirstL < a)
            {
                FirstL = a;
            }
        }
        for (int b : arr)
        {
            if (FirstL > b && SecL < b)
            {
                SecL = b;
            }
        }
//        System.out.print(SecL);
        return SecL;
    }

}

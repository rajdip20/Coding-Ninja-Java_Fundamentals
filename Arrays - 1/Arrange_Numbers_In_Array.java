/*
You have been given an empty array(ARR) and its size N. 
The only input taken from the user will be N and you need not worry about the array.

Your task is to populate the array using the integer values 
in the range 1 to N(both inclusive) in the order - 1,3,.......4,2
*/

public class Arrange_Numbers_In_Array {
    public static void arrange(int[] arr, int n) {
        //Your code goes here
        if (n%2 != 0) 
        {
            arr[n/2]=n;
        }
        int even = 2; int odd = 1; int i = 0;
        while (i < n/2) {
            arr[i] = odd;
            odd += 2;
            arr[n - i-1] = even;
            even += 2;
            i++;
        }
    }
}

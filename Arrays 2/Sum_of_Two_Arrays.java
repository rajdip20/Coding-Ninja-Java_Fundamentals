/*
Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively.
Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index).
The idea here is to represent each array/list as an integer in itself of digits N and M.

You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list 
i.e. output array/list will also contain only single digit at every index.
*/

public class Sum_of_Two_Arrays {

    public static void sumOfTwoArrays(int arr1[], int arr2[], int output[]) {
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int carry = 0;
        int k = Math.max(arr1.length, arr2.length);
        while(i >= 0 && j >= 0)
        {
            int sum = arr1[i] + arr2[j] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i -= 1;
            j -= 1;
            k -= 1;
        } 
        while(i >= 0)
        {
            int sum = arr1[i] + carry;
            output[k] = sum % 10;
            carry = sum / 10;
            i -= 1; k -= 1;
        }
        while(j >= 0)
        {
            int sum = arr2[j] + carry; output[k] = sum % 10;
            carry = sum / 10;
            j -= 1;
            k -= 1;
        }
        output[0] = carry;
    }
}

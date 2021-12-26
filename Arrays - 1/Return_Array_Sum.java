/*
Given an array/list(ARR) of length N, you need to find and return the sum of all the elements in the array/list.
*/

import java.util.*;

public class Return_Array_Sum{
    
    public static int[] takeInput(){
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] input = new int[size];
        for(int i=0;i<size;i++)
        {
            input[i]=s.nextInt();
        }
        return input;
        
    }
    
    public static int sum(int[] input)
    {
        int sum=0;
        for(int i=0;i<input.length;i++)
        {
            sum=sum+input[i];
        }
        return sum;

    }
    
    public static void main(String[] args)
    {
        int arr[] = takeInput();
        int allSum=sum(arr);
            System.out.println(allSum);
    }
}
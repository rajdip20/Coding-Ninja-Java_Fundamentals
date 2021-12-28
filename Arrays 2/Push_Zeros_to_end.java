/*
You have been given a random integer array/list(ARR) of size N.
You have been required to push all the zeros that are present in the array/list to the end of it.
Also, make sure to maintain the relative order of the non-zero elements.
*/

public class Push_Zeros_to_end {

    public static int[] pushZerosAtEnd(int[] arr) {
        int[] arr2=new int[arr.length];
        int p=0;
        for (int i = 0; i < arr2.length; i++) {
            if(arr[i]!=0){
                arr2[p]=arr[i];
                p++;
            }
        }
        System.arraycopy(arr2, 0, arr, 0, arr.length);
        return arr;
    }

}

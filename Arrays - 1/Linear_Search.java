/*
You have been given a random integer array/list(ARR) of size N, and an integer X. 
You need to search for the integer X in the given array/list using 'Linear Search'.
*/

public class Linear_Search {
    public static int linearSearch(int arr[], int x) {
        //Your code goes here
        boolean find=false;
        int i;
        for (i =0;i< arr.length;i++){
            if (arr[i]==x){
                find=true;
                break;
            }
        }
        if (find==false){
            return -1;
        }
        else {
            return i;
        }
    }
}

/*
For a given two strings, 'str1' and 'str2', check whether they are a permutation of each other or not.
 Permutations of each other
    Two strings are said to be a permutation of each other when either of the string's characters can be rearranged so that it becomes identical to the other one.

    Example: 
        str1= "sinrtg" 
        str2 = "string"

    The character of the first string(str1) can be rearranged to form str2 and hence we can say that the given strings are a permutation of each other.
*/

import java.util.*;

public class Check_Permutation {

    public static boolean isPermutation(String str1, String str2) {
        //Your code goes here
        int n1 = str1.length();
        int n2 = str2.length();
        if (n1 != n2)
            return false;
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        for (int i = 0; i < n1; i++)
            if (ch1[i] != ch2[i])
                return false;
        return true;
    }
}

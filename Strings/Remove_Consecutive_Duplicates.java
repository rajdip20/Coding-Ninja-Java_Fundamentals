/*
For a given string(str), remove all the consecutive duplicate characters.
 Example:
    Input String: "aaaa"
    Expected Output: "a"

    Input String: "aabbbcc"
    Expected Output: "abc"
*/

public class Remove_Consecutive_Duplicates {

    public static String removeConsecutiveDuplicates(String str) {
        //Your code goes here
        String s1=new String();
        int len=str.length();
        int temp=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {   
            if(temp!=(int)str.charAt(i))
            { 
                s1+=str.charAt(i);
               // j++;
            }
            temp=(int)str.charAt(i); 
        }
        return s1;
    }
}

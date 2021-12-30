/*
Given a string, determine if it is a palindrome, considering only alphanumeric characters.
*/

public class String_Palindrome {

    public static boolean isPalindrome(String str) {
        //Your code goes here
        int len=str.length()-1;
        String a= "";
        for (int i = len; i >=0 ; i--)
        {
            a+=(str.charAt(i));
        }
        // System.out.println(a);
        return a.equals(str);
    }

}

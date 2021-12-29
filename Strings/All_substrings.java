/*
For a given input string(str), write a function to print all the possible substrings.
 Substring
    A substring is a contiguous sequence of characters within a string. 

    Example: "cod" is a substring of "coding". Whereas, "cdng" is not as the characters taken are not contiguous
*/

public class All_substrings {

    public static void printSubstrings(String str) {
        //Your code goes here
        for (int i = 0; i < str.length(); i++)
        {
            for (int j = i; j < str.length(); j++)
            {
                for (int k = i; k <=j; k++)
                {
                    System.out.print(str.charAt(k));
                }
                System.out.println();
            }
        }
    }
}

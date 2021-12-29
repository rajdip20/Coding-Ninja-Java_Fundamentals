/*
For a given a string(str) and a character X, write a function to remove all the occurrences of X from the given string.

The input string will remain unchanged if the given character(X) doesn't exist in the input string.
*/

public class Remove_character {

    public static String removeAllOccurrencesOfChar(String str, char ch) {
        // Your code goes here
        String s1=new String();
        int len=str.length();
        int temp=(int)ch;
        for(int i=0;i<len;i++)
        {
            if((int)str.charAt(i)==temp)
               continue;
            s1+=str.charAt(i);

        }
        return s1;
    }
}

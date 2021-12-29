/*
Write a program to do basic string compression.
For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions.

Example:
    If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5".

    The string is compressed only when the repeated character count is more than 1.
*/

public class Compress_the_String {

    public static String getCompressedString(String str) {
        // Write your code here.
        String s=new String();
        int n = str.length();
        for (int i = 0; i < n; i++)
        {

            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1))
            {
                count++;
                i++;
            }
            s+=str.charAt(i);
            if(count>1)
            {
                s+=count;
            }
        }
        return s;
    }
}

/*
For a given a string(str), find and return the highest occurring character.

 Example:
    Input String: "abcdeapapqarr"
    Expected Output: 'a'
    Since 'a' has appeared four times in the string which happens to be the highest frequency character, the answer would be 'a'.
*/

public class Highest_Occuring_Character {

    public static char highestOccuringChar(String str) {
        //Your code goes here
        int count[] = new int[256];

        int len = str.length();
        for (int i=0; i<len; i++)
            count[str.charAt(i)]++;

        int max = -1;
        char result = ' ';

        for (int i = 0; i < len; i++)
        {
            if (max < count[str.charAt(i)])
            {
                max = count[str.charAt(i)];
                result = str.charAt(i);
            }

        }

        return result;
    }

}

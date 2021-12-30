/*
Aadil has been provided with a sentence in the form of a string as a function parameter.
The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.

Example:
    Input Sentence: "Hello, I am Aadil!"
    The expected output will print, ",olleH I ma !lidaA"
*/

import java.lang.*;

public class Reverse_Each_Word {

    public static String reverseEachWord(String str) {
        //Your code goes here
        String words[]=str.split("\\s");
        String reverseWord="";
        for(String w:words)
        {
            StringBuilder sb=new StringBuilder(w);
            sb.reverse();
            reverseWord+=sb.toString()+" ";
        }
        return reverseWord.trim();
    }

}

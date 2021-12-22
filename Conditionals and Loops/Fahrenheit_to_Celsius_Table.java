/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.
*/

import java.util.Scanner;

public class Fahrenheit_to_Celsius_Table {
    public static void main(String[] args) {

        /*
         * Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */
        Scanner s = new Scanner(System.in);
        int S = s.nextInt();
        int E = s.nextInt();
        int W = s.nextInt();
        int fah;
        while (S <= E) {
            fah = ((5 * (S - 32)) / 9);
            System.out.println(S + " " + fah);
            S += W;
        }
    }
}

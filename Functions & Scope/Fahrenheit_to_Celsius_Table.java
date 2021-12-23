/*
Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), 
you need to convert all Fahrenheit values from Start to End at the gap of W, 
into their corresponding Celsius values and print the table.
*/

import java.util.*;

public class Fahrenheit_to_Celsius_Table {
    public static void printFahrenheitTable(int start, int end, int step)
    {
        for(int i=start;i<=end;i=i+step)
        {
            int cel=(int)((5.0/9)*(i-32));
            System.out.println(i +"\t"+ cel);
        }
    }
    
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int step=sc.nextInt();
        printFahrenheitTable(start,end,step);
    }
}

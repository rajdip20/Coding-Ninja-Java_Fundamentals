/*
Write a program to calculate the total salary of a person. 
The user has to enter the basic salary (an integer) and the grade (an uppercase character), 
and depending upon which the total salary is calculated as -

    totalSalary = basic + hra + da + allow – pf
*/

import java.util.*;
public class Total_Salary {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();

        char grade = sc.next().charAt(0);

        int a = basic;
        int allow = 1300;
        double hra = (0.2d * basic);
        double da = (0.5d * basic);
        if (grade == 'A') {
            allow = 1700;
        } else if (grade == 'B') {
            allow = 1500;
        }
        double pf = (0.11d * basic);
        double totalSalary = a + hra;
        totalSalary += da;
        totalSalary += allow;
        totalSalary -= pf;

        System.out.println(Math.round(totalSalary));
    }
}

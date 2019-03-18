// Solution in Java to HackerRank -> Tutorials -> 30 Days of Code Day 1
// By Karel Vanhelden
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int j = 0;
        double e = 0.0;
        String stwo = "";
        /* Read and save an integer, double, and String to your variables.*/
        j = scan.nextInt();
        e = scan.nextDouble();
        scan.nextLine();
        stwo = scan.nextLine();
        /* Print the sum of both integer variables on a new line. */
        int isum = j + i;
        System.out.println(isum);
        /* Print the sum of the double variables on a new line. */
		double dsum = e + d;
        System.out.println(dsum);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
       String conc = s + stwo;

        System.out.println(conc);
        scan.close();
    }
}

/**
 * Exercise 8 :A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;
import java.util.Scanner;
public class Checkstring {

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str=scanner.next();
    int len=str.length();
    if(checkString(str,len,scanner))
    	System.out.print("Positive string");
    else
    	System.out.print("Negative string");
	}
	private static boolean checkString(String str,int len,Scanner scanner)
	{
		char []arr=str.toCharArray();
		for(int index=0;index<len-1;index++)
		{
			if(arr[index]>arr[index+1])
				return false;
		}
		return true;
	}

}

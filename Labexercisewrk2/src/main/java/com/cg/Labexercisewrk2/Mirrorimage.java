/**
 * Exercise 2: Create a class containing a method to create the mirror image of a String. The method should return the two Strings separated with a pipe(|) symbol .
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;

import java.util.Scanner;

public class Mirrorimage {
    Scanner scanner = new Scanner(System.in);
	public void main(String[] args) {
	    String str=scanner.next();
	    System.out.print(getImage(str));
		}
		public String getImage(String str)
		{
			if(str.equals(""))
				return "";
			else
			{
				StringBuilder st = new StringBuilder(str);
				StringBuilder ss= new StringBuilder(str);
				StringBuilder rev=st.reverse();
				rev=ss.append("|"+st);
				return rev.toString();
			}
			
		}
}

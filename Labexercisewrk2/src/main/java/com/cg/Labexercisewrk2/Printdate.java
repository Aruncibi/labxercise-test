/**
 * Exercise 9: Create a method to accept date and print the duration in days, months and years with regards to current system date.
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;
//import java.util.Scanner;
public class Printdate {

	public static void main(String[] args) {
    //Scanner scanner = new Scanner();
    String date="29th December 2020";
    System.out.print(printDate(date));
	}
	private static String printDate(String date)
	{
		StringBuilder dmy = new StringBuilder("");
		String []words=date.split(" ");
		String dt=date.substring(0,2);
		int d=Integer.parseInt(dt);
		String month=words[1];
		String year=words[2];
		int mn=0;
		if(month.equals("January"))
			mn=1;
		else if(month.equals("February"))
			mn=2;
		else if(month.equals("March"))
			mn=3;
		else if(month.equals("April"))
			mn=4;
		else if(month.equals("May"))
			mn=5;
		else if(month.equals("June"))
			mn=6;
		else if(month.equals("July"))
			mn=7;
		else if(month.equals("August"))
			mn=8;
		else if(month.equals("September"))
			mn=9;
		else if(month.equals("October"))
			mn=10;
		else if(month.equals("November"))
			mn=11;
		else if(month.equals("December"))
			mn=12;
		dmy=dmy.append(d+"/"+mn+"/"+year);
		return dmy.toString();
	}

}

/**
 * Exercise 5: Write a Java program that displays the number of characters, lines and words in a text? 
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;
//import java.util.Scanner;
public class Displaychars {

	public static void main(String[] args) {
    //Scanner scanner = new Scanner(System.in);
    String str="fsfsfs ghghghg \newewrwt hhtytu ";
    String []words=str.split("[ ,.]+");
    String []lines=str.split("[\r\n]");
    System.out.println("No of characters = "+str.length());
    System.out.println("No of lines = "+lines.length);
    System.out.println("No of words = "+words.length);
	}

}

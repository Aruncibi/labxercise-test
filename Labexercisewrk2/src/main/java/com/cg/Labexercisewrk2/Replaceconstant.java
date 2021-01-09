/**
 * Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet. 
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;
import java.util.Scanner;
public class Replaceconstant {
	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.next();
    alterString(str,scanner);
	}
    private static String alterString(String str,Scanner scanner)
    {
    	StringBuilder stt = new StringBuilder("");
    	char c;
        char[] ch = str.toCharArray(); 
        int len=ch.length;
        for(int index=0;index<len;index++)
        {
        	if(str.charAt(index)!='a' && str.charAt(index)!='e' && str.charAt(index)!='i' && str.charAt(index)!='o' && str.charAt(index)!='u' && str.charAt(index)!='A' && str.charAt(index)!='E' && str.charAt(index)!='I' && str.charAt(index)!='O' && str.charAt(index)!='U')
        	{
        		c=(char)(ch[index]+1);
        		System.out.print(c);
        	}
        	else 
        	{
        		c=ch[index];
        		System.out.print(c);
        	}
        	stt=stt.append(c);
        }
    	return stt.toString();
    }
}

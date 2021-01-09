/**
 * Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers. (Use String Tokenizer class)?
 *@author Arun cibi
 *
 */
package com.cg.Labexercisewrk2;

//import java.util.StringTokenizer;

public class Stringtokenizer1 {
		public void main(String[] args) {
			 String str="1 2 3 4";
			 System.out.println(getMethod(str));
		}
		public int getMethod(String str)
		{
			 String[] words=str.split(" ");
			 int len=words.length;
			if(len==0)
				return 0;
			else if(len==1)
				return Integer.parseInt(words[0]);
			else
			{
			 int sum=0;
		     for(int index=0;index<len;index++)
		     {  
		    	 int n=Integer.parseInt(words[index]);
		         sum=sum+n;;  
		     }  
	     return sum;
			}
		}
	}


package com.cg.Labexercisewrk2;

//import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class Stringtokenizer1test {
	private  Stringtokenizer1 stringtokenizer1;
	@Before
	public void setup()
	{
		stringtokenizer1 = new Stringtokenizer1();
	}
	@Test
	public void getArrayof_integerElementAs1Array_AndreturnAsInteger() {
		String ar="1";
		int arr=stringtokenizer1.getMethod(ar);
		assertEquals(1,arr);
	}
	@Test
	public void getArrayof_integerElementAsEmptyArray_Andreturn0AsInteger() {
		String ar=" ";
		int arr=stringtokenizer1.getMethod(ar);
		assertEquals(0,arr);
	}
	@Test
	public void getArrayof_integerElementAs_morethan2Array_AndreturnSecondsmallestAsInteger() {
		String ar= "1 2 3";
		int arr=stringtokenizer1.getMethod(ar);
		String wrd[]=ar.split(" ");
		int len=wrd.length;
		int sum=0;
		for(int index=0;index<len;index++)
		sum+=Integer.parseInt(wrd[index]);
		assertEquals(sum,arr);
	}	

}

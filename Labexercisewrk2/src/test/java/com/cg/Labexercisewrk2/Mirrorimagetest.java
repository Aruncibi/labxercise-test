package com.cg.Labexercisewrk2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class Mirrorimagetest {
	private  Mirrorimage mirrorimage;
	@Before
	public void setup()
	{
		mirrorimage = new Mirrorimage();
	}
	@Test
	public void get_StringAsEmpty_AndreturnnullAsString() {
		String ar="";
		String arr=mirrorimage.getImage(ar);
		assertEquals("",arr);
	}
	@Test
	public void getStringsAs_morethan2_AndreturnMirrorimageAsString(){
		String ar= "4321";
		String arr=mirrorimage.getImage(ar);
		StringBuilder str=new StringBuilder(ar);
	    StringBuilder st=new StringBuilder(ar);
	    st=st.reverse();
	    StringBuilder res=str.append("|"+st);
		String ar1=res.toString();
		assertEquals(ar1,arr);
	}	
}

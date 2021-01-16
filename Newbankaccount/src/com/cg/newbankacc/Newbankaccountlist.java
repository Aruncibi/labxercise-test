/**
 * Exercise1:Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.
 * @author Arun cibi
 *
 */
package com.cg.newbankacc;

import java.util.ArrayList;

public class Newbankaccountlist {
	 ArrayList<Newbankaccount> list = new ArrayList<Newbankaccount>();
	    public void Newbankaccountlist(Newbankaccount v)
	    {
	        list.add(v);
	    }
	    public ArrayList<Newbankaccount> getPersondetails()
	    {
	       return list;
	    }
}

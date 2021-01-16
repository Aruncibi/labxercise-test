/**
 * Exercise1:Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.
 * @author Arun cibi
 *
 */
package com.cg.bankacc;
import java.util.*;

import com.cg.newbankacc.Newbankaccount;
import com.cg.newbankacc.Newbankaccountlist;
public class Main {
	 public static void main(String args[]) {
	        Scanner s = new Scanner(System.in);
	        Newbankaccountlist vi = new Newbankaccountlist();
	        long accno;
	        String Name,acctype;
	        double balance;
	        int cnt;
	        while(true)
	        {
		        Newbankaccount v = new Newbankaccount();
	            System.out.println("1.Add the details");
	            System.out.println("2.Display name");
	            System.out.println("3.Exit");
	            cnt = s.nextInt();
	            if(cnt==1)
	            {
		        accno=System.currentTimeMillis();
		        v.setAccno(accno);
	            System.out.println("Enter your name");
	            Name=s.next();
	            v.setName(Name);
	            System.out.println("Enter your Account type as savings/current");
	            acctype=s.next();
	            v.setAcctype(acctype);
	            if(acctype.equalsIgnoreCase("savings"))
	            {
	            	balance=500;
	            	v.setBalance(balance);
	            }
	            else if(acctype.equalsIgnoreCase("current"))
	            {
	            	balance=5000;
	            	v.setBalance(balance);
	            }
	            else
	            {
	            	System.out.println("Enter valid account type");
	            return;
	            }
	            System.out.println("Deposit/withdraw");
	            String actiontype=s.next();
	            System.out.println("Enter amount");
	            double amount=s.nextDouble();
	            if(actiontype.equalsIgnoreCase("deposit"))
	            	v.deposit(amount);
	            else if(actiontype.equalsIgnoreCase("withdraw"))
	            	v.withdraw(amount);
	            vi.Newbankaccountlist(v);
	            }
	            else if(cnt==2)
	            {
	               ArrayList<Newbankaccount> l= vi.getPersondetails();
	               System.out.println("--------Customers Details--------");
	               for(Newbankaccount f : l)
	                System.out.println("Account no- "+f.getAccno()+" Name- "+f.getName() +" Accounttype-"+f.getAcctype()+" Balance-"+f.getBalance());
	            }
	            else if(cnt==3)
	            {
	                System.out.println("Exited");
	                return;
	            }
	            }

	    }
}

package com.cg.vm.util;

import com.cg.vm.bean.Booking;
import com.cg.vm.dao.IBookingRepositoryImpl;

public class Bookingmenu extends VMSMenu {
	
	
	   void bookingmenustart(){
		   System.out.println("Valid user");
			System.out.println("-----Booking Services------");
			System.out.println("1.Book your Vehice");
			System.out.println("2.Cancel Booking");
			System.out.println("3.Update Booking");
			System.out.println("View Booking");
			System.out.print("Enter your booking choice");
				int bookingchoice=sc.nextInt();
			switch(bookingchoice) {
			case 1:
				System.out.println("------Enter your booking details-------");
				Booking booking=new Booking();
				System.out.println("Enter your booking date");
				
				
				System.out.println("Enter Your booking till date");
			
			}
			
			IBookingRepositoryImpl ibookingRepositoryImpl=new IBookingRepositoryImpl();
		   
	   }

}

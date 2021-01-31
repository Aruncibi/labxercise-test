package com.cg.vm.util;

import java.util.Scanner;
import com.cg.vm.bean.Driver;
import com.cg.vm.service.ICustomerService;
import com.cg.vm.service.ICustomerServiceImpl;

public class AdminMenu {
	
	 ICustomerService iCustomerService;
	
	 AdminMenu (){
		iCustomerService=new ICustomerServiceImpl();
		
	}
	

	public  void adminmenustart() {
		AdminMenu adminMenu=new AdminMenu();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your username");
		String adminusr=sc.next();
		System.out.println("Enter Your password");
		String adminpwd=sc.next();
		if(adminusr.equals("admin")&&adminpwd.equals("admin")) {
			String continueChoice;
			do {
			System.out.println("1.View all Customers");
			System.out.println("2.view all bookings");
			System.out.println("3.Requests of Booking");
			System.out.println("4.Cancel Booking Requests");
			System.out.println("5.Add Driver details");
			System.out.println("6.View available Drivers");
			System.out.println("7.View updated Drivers");
			System.out.println("8.Delete drivers details");
			int adminChoice=sc.nextInt();
			switch(adminChoice) {
			case 1:
				System.out.print("List of Customers");
				iCustomerService.viewAllCustomer(adminpwd);
				break;
			case 5:
				System.out.println("Add Driver details");
				Drivermenu drivermenu = new Drivermenu();
				drivermenu.adddrivers();
				break;
			case 6:
				System.out.println("Available Drivers");
				Drivermenu drivermenu1 = new Drivermenu();
				drivermenu1.availabledrivers();
				break;
			case 7:
				System.out.println("Updated drivers list");
				Drivermenu drivermenu2 = new Drivermenu();
				System.out.println("Enter details you want to update");
				String FirstName=sc.next();
				drivermenu2.updateddrivers(FirstName);
				break;
			case 8:
				System.out.println("Updated list after deletion");
				Drivermenu drivermenu3 = new Drivermenu();
				System.out.println("Enter details you want to delete");
				int Id=sc.nextInt();
				drivermenu3.deltedriver(Id);
				break;
			case 9:
				default :
					System.out.println("Wrong choice");
			
			}
			System.out.print("Do you want to continue [yes/no]");
			continueChoice=sc.next();
			
			
		}while(continueChoice.equalsIgnoreCase("yes"));
			
		}
		
	}
	

}

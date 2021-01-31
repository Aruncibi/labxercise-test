package com.cg.vm.util;

import java.util.Scanner;

import com.cg.vm.bean.Customer;
import com.cg.vm.bean.User;
import com.cg.vm.dao.IUserRepositoryImpl;

public class VMSMenu extends DBUtil {
	Scanner sc=new Scanner(System.in);
	Customer customer = new Customer();
	
		public void start() {
			
			
			System.out.println("Select User");
			System.out.println("1.Administrator");
			System.out.println("2.Customer");
			int select_user=sc.nextInt();
			
			if(select_user==2) {
			int choice;
			String continueChoice;
			do {
				showmenu();
				System.out.println("Enter your choice");
				choice=sc.nextInt();
				switch(choice) {
				case 1:
					CustomerMenu customerMenu=new CustomerMenu();
					customerMenu.customermenustart();
					
				        break;
				
				case 2:
					User user=new User();
					System.out.println("--------Customer Login-----------");
					//System.out.println("Enter your user Id");
					//String usrId=sc.next();
					
					//entityManager.getTransaction().begin();
					//TypedQuery<Customer> cus =entityManager.createQuery("SELECT c FROM Customer c", Customer.class);
					    
					 
					
					System.out.println("Enter your username");
					String usrName=sc.next();
					System.out.println("Enter your password ");
					String pwd=sc.next();
					user.setUserId(usrName);
					user.setPassword(pwd);
					IUserRepositoryImpl iUserRepositoryImpl=new IUserRepositoryImpl();
					iUserRepositoryImpl.validateUser(user);
					
					
					/*if(  usrName.equals(customer.getEmailId())&& pwd.equals(customer.getFirstName())){
						
						Bookingmenu bookingMenu=new Bookingmenu();
						bookingMenu.bookingmenustart();
						
					     
						
						
					}
					else {
						System.out.print("Invalid user");
					}
					
					
					entityManager.getTransaction().commit();*/
					
					
					break;
				case 0:
					System.exit(0);
					break;
					default :
						System.out.print("Wrong choice");
						
						
				}
				System.out.print("Do you want to continue [yes/no]");
				continueChoice=sc.next();
				
				
			}while(continueChoice.equalsIgnoreCase("yes"));
			 
			   
				
					
				
			}
			else if(select_user==1)
			{
				AdminMenu adminmenu=new AdminMenu();
				adminmenu.adminmenustart();
			}
			
		
		    else {
		    	System.out.println("Invalid User");
		    }
			
		}

		private void showmenu() {
			System.out.println("---------Customer Login-----------");
			System.out.println("1.Register");
			System.out.println("2. Login");
			System.out.println("0.exit");
			
			
		}


}

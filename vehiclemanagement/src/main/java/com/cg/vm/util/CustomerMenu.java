package com.cg.vm.util;

import java.util.Scanner;

import com.cg.vm.bean.Customer;
import com.cg.vm.dao.ICustomerRepositoryImpl;

public class CustomerMenu {

	public void customermenustart() {
		Scanner sc = new Scanner(System.in);
		Customer customer = new Customer();

		System.out.println("--------Customer Registration-----------");
		System.out.println("Enter your first name");
		customer.setFirstName(sc.next());
		System.out.println("Enter your last name");
		customer.setLastName(sc.next());
		System.out.println("Enter your Mobile number");
		customer.setMobileNumber(sc.next());
		System.out.println("Enter your Email ID");
		customer.setEmailId(sc.next());
		System.out.println("Enter your address");
		customer.setAddress(sc.next());

		System.out.println("Enter your User Id");
		customer.setUserId(sc.next());
		System.out.println("Enter your Password");
		customer.setPassword(sc.next());
		customer.setRole("Customer");
		ICustomerRepositoryImpl iCustomerRepositoryImpl = new ICustomerRepositoryImpl();
		iCustomerRepositoryImpl.addCustomer(customer);
		Customer savedCustomer = iCustomerRepositoryImpl.addCustomer(customer);

		System.out.println(savedCustomer);

		System.out.println("Registration completed Successfully");
		sc.close();

	}

}

package com.cg.vm.util;
import com.cg.vm.bean.Driver;
import java.util.Scanner;
import com.cg.vm.util.*;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.*;
public class Drivermenu {
	DBUtil dbUtil = new DBUtil();
	public void adddrivers() {
	Scanner s = new Scanner(System.in);
	int driverId;
	String firstName,lastName,address,contactNumber,emailId,licenseNo = null;
		Driver driver = new Driver();
		System.out.println("First Name");
		firstName=s.next();
		driver.setFirstName(firstName);
		System.out.println("Last Name");
		lastName=s.next();
		driver.setLastName(lastName);
		System.out.println("Address");
		address=s.next();
		driver.setAddress(address);
		System.out.println("Mobile Number");
		contactNumber=s.next();
		driver.setContactNumber(contactNumber);
		System.out.println("Email-id");
		emailId=s.next();
		driver.setEmail(emailId);
		System.out.println("Licenseno");
		licenseNo=s.next();
		driver.setLicenseNo(licenseNo);
	System.out.println("Success");
//	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
//	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityManager entityManager = dbUtil.createEntityManager();
	entityManager.getTransaction().begin();
	entityManager.persist(driver);
	entityManager.getTransaction().commit();
	dbUtil.closeResources();
	System.out.println(driver);

}
	public void availabledrivers()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Query query =entityManager.createQuery("from Driver");
		List<Driver> users =  query.getResultList();
		for (Driver user : users) {
			System.out.println("FirstName : "+user.getFirstName());
			System.out.println("LastName : "+user.getLastName());
			System.out.println("Contact : "+user.getContactNumber());
			System.out.println("email : "+user.getEmail());
			System.out.println("Address : "+user.getAddress());
			System.out.println("License No :"+user.getLicenseNo());
			System.out.println("-----------------------------");
		}
		
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void updateddrivers(String FirstName)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		Driver driver = entityManager.find(Driver.class, 66);
		driver.setFirstName(FirstName);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
	public void deltedriver(int Id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
	    Driver driver = entityManager.find(Driver.class, Id);
		entityManager.remove(driver);
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManagerFactory.close();
	}
}

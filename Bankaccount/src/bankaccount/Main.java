/**
 * Exercise1:Create Person and Account Class as shown below in class diagram. Ensure minimum balance of INR 500 in a bank account is available.
 * @author Arun cibi
 *
 */
package bankaccount;
import java.util.*;
public class Main {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
	scanner = new Scanner(System.in);
    Account obj1 = new Account();
    Account obj2 = new Account();
    Person obj = new Person();
    Person ob = new Person();
    System.out.println("Enter name");
    String name=scanner.next();
    obj.setName(name);
    System.out.println("Enter age");
    Float age=scanner.nextFloat();
    obj.setAge(age);
    int minimumbalance,overdraftlimit;
    int amount;
    minimumbalance=2000;
    overdraftlimit=500;
    obj1.setMinbalance1(minimumbalance);
    obj1.setOverdraftlimit(overdraftlimit);
    System.out.print(obj.getName()+", please enter withdraw or deposit- ");
    String check=scanner.next();
    System.out.println("Enter amount");
    amount=scanner.nextInt();
    obj1.setAmount(amount);
    if(check.equalsIgnoreCase("withdraw"))
    obj1.withdraw();
    else
    	obj1.deposit();
    System.out.println("Enter name");
    String name1=scanner.next();
    ob.setName(name1);
    System.out.println("Enter age");
    Float age1=scanner.nextFloat();
    ob.setAge(age1);
    minimumbalance=3000;
    obj2.setMinbalance1(minimumbalance);
    System.out.print(ob.getName()+" please enter withdraw or deposit- ");
    String check1=scanner.next();
    System.out.println("Enter amount");
    int amount1=scanner.nextInt();
    obj2.setAmount(amount1);
    if(check1.equalsIgnoreCase("withdraw"))
        obj2.withdraw();
        else
        	obj2.deposit();
    System.out.println(obj.getName()+" balance "+obj1.getMinbalance1());
    System.out.println(ob.getName()+" balance "+obj2.getMinbalance1());
    System.out.println("thank you");
	}
    
}

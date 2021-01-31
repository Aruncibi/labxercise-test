package bankaccount;
public class Account implements Savingsacc, Currentacc
{
	private int overdraftlimit;	
	private int minbalance1;
	private int amount;
	private long accnum;
	private Person person;
	public void setOverdraftlimit(int overdraftlimit)
	{
		this.overdraftlimit=overdraftlimit;
	}
	public long getAccnum() {
		return accnum;
	}
	public void setAccnum(long accnum) {
		this.accnum = accnum;
	}
	public int getOverdraftlimit()
	{
		return overdraftlimit;
	}
	public void setMinbalance1(int minbalance1)
	{
		this.minbalance1=minbalance1;
	}
	public int getMinbalance1()
	{
		return minbalance1;
	}
	public void setAmount(int amount)
	{
	this.amount=amount;
	}
	public int getAmount()
	{
		return amount;
	}
	@Override
	public void withdraw(int minbalance1) {
		//if((getMinbalance1()-getAmount())>overdraftlimit)
			this.minbalance1=minbalance1;
	}
	public boolean withdraw() {
		if((getMinbalance1()-getAmount())>overdraftlimit) {
			this.minbalance1=this.minbalance1-this.amount;
             return true;
		}
		return false;
		// TODO Auto-generated method stub
	}
	public void deposit() {
		this.minbalance1=this.minbalance1+this.amount;
		
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}

	}
package bankaccount;

public class Person {
	private String name;
	private float age;
	private Person person;
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public float getAge() {
		return age;
	}
	public void setAge(float age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	

}

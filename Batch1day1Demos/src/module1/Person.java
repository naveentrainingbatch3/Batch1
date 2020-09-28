package module1;

public class Person {

	private int personId;
	private String personName;
	private static String companyName="Edureka";
	
	public Person(int personId,String personName)
	{
		this.personId=personId;
		this.personName=personName;
		
	}
	static void check()
	{
		companyName= "Amdocs";
	}
	public void display()
	{
		System.out.println(personId+""+personName+""+companyName);
	}
	public static void main(String[] args) {
		Person.check();
		Person p=new Person(11,"Aman" );
		Person p2=new Person(12,"Madhura");
		p.display();
		p2.display();
		
	}
	
}

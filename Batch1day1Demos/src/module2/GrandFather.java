package module2;

public class GrandFather
{
 GrandFather()
 {
	 System.out.println("GrandFather Construtor");
 }
	void gainProperty()
	{
		System.out.println("5 acres of Land");
	}
}
class Father extends GrandFather
{
	Father()
	{
		//super(3);
		 System.out.println("Father Construtor");
	}
	void additionalgainProperty()
	{
		System.out.println("10 acres of land");
	}
}
class Son extends Father
{
	Son()
	{
		System.out.println("Son Constructor");
	}
	 void bungalow()
	 {
		 System.out.println("He will purchase a bungalow");
	 }
	public static void main(String[] args) {
		
		GrandFather gf=new GrandFather();
		Father f=new Father();
		Son s=new Son();
		gf.gainProperty();
		f.gainProperty();
		
		f.additionalgainProperty();
		s.gainProperty();
		s.additionalgainProperty();
		s.bungalow();
	}
}
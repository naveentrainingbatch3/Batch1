package module2;

public abstract class Demo {

	Demo()
	{
		System.out.println("Demo class constructor");
	}
	 protected  abstract void display();
	 void show()
	 {
		 System.out.println("Show method");

 System.out.println("Naveen Kumar");
	 }
	
}
  class Test extends Demo
{
	Test()
	{
		System.out.println("Test Class Constructor");
	}

	
	  protected void display() { System.out.println("Test class display method"); }
	 
	public static void main(String[] args) {
		Demo d=new Test();
		d.display();
		d.show();
	}
}

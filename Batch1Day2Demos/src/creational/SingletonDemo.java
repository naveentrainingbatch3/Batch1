package creational;

public class SingletonDemo {
public static void main(String[] args) 
{
	//Singleton firstInstance=new Singleton();
	Singleton firstInstance=Singleton.getInstance();
	System.out.println(firstInstance.hashCode());
	Singleton secondInstance=Singleton.getInstance();
	System.out.println(secondInstance.hashCode());
}
}
